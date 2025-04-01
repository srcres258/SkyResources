package top.srcres258.renewal.skyresources.block.custom

import com.mojang.serialization.MapCodec
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.server.level.ServerLevel
import net.minecraft.tags.BlockTags
import net.minecraft.tags.FluidTags
import net.minecraft.util.RandomSource
import net.minecraft.world.entity.Entity
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.Level
import net.minecraft.world.level.LevelAccessor
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.IntegerProperty
import net.minecraft.world.level.pathfinder.PathComputationType
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape
import net.neoforged.neoforge.common.CommonHooks

private val COLLISION_SHAPE: VoxelShape = Block.box(1.0, 0.0, 1.0, 15.0, 15.0, 15.0)
private val OUTLINE_SHAPE: VoxelShape = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0)

class DehydratedCactusBlock(properties: Properties) : Block(properties) {
    companion object {
        val CODEC: MapCodec<DehydratedCactusBlock> = simpleCodec(::DehydratedCactusBlock)
        val AGE: IntegerProperty = BlockStateProperties.AGE_15
        const val MAX_AGE = 15
    }

    init {
        registerDefaultState(stateDefinition.any().setValue(AGE, 0))
    }

    override fun codec(): MapCodec<out Block> = CODEC

    override fun tick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        if (!level.isAreaLoaded(pos, 1)) {
            // This prevents growing cactus from loading unloaded chunks with block update.
            return
        }
        if (!state.canSurvive(level, pos)) {
            level.destroyBlock(pos, true)
        }
    }

    override fun randomTick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        val abovePos = pos.above()
        if (level.isEmptyBlock(abovePos)) {
            var i = 1
            while (level.getBlockState(pos.below(i)).`is`(this)) {
                i++
            }

            if (i < 3) {
                val age = state.getValue(AGE)
                if (CommonHooks.canCropGrow(level, abovePos, state, true)) {
                    if (age >= MAX_AGE) {
                        level.setBlockAndUpdate(abovePos, defaultBlockState())
                        val newState = state.setValue(AGE, 0)
                        level.setBlock(pos, newState, UPDATE_NONE)
                        level.neighborChanged(newState, abovePos, this, pos, false)
                    } else {
                        level.setBlock(pos, state.setValue(AGE, age + 1), UPDATE_NONE)
                    }
                    CommonHooks.fireCropGrowPost(level, pos, state)
                }
            }
        }
    }

    override fun getCollisionShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = COLLISION_SHAPE

    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = OUTLINE_SHAPE

    override fun updateShape(
        state: BlockState,
        direction: Direction,
        neighborState: BlockState,
        level: LevelAccessor,
        pos: BlockPos,
        neighborPos: BlockPos
    ): BlockState {
        if (!state.canSurvive(level, pos)) {
            level.scheduleTick(pos, this, 1)
        }

        return super.updateShape(state, direction, neighborState, level, pos, neighborPos)
    }

    override fun canSurvive(state: BlockState, level: LevelReader, pos: BlockPos): Boolean {
        for (direction in Direction.Plane.HORIZONTAL) {
            val directionState = level.getBlockState(pos.relative(direction))
            if (directionState.isSolid || level.getFluidState(pos.relative(direction)).`is`(FluidTags.LAVA)) {
                // There are lava blocks nearby, so this block cannot survive.
                return false
            }
        }

        val belowState = level.getBlockState(pos.below())
        val soilDecision = belowState.canSustainPlant(level, pos.below(), Direction.UP, state)
        // Check whether the soil below is valid (sand or sand-like) and the block above is not liquid.
        return if (soilDecision.isDefault) {
            (belowState.`is`(this) || belowState.`is`(BlockTags.SAND)) && !level.getBlockState(pos.above()).liquid()
        } else {
            soilDecision.isTrue
        }
    }

    override fun entityInside(state: BlockState, level: Level, pos: BlockPos, entity: Entity) {
        // Damage the entity when it is touched by the block.
        entity.hurt(level.damageSources().cactus(), 1F)
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(AGE)
    }

    // This block is not path-findable by AI.
    override fun isPathfindable(state: BlockState, pathComputationType: PathComputationType): Boolean = false
}