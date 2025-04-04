package top.srcres258.skyresources.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

private val SHAPE: VoxelShape = Shapes.or(
    Block.box(0.0, 10.0, 0.0, 16.0, 16.0, 16.0),
    Block.box(4.0, 0.0, 4.0, 12.0, 10.0, 12.0),
    Block.box(0.0, 0.0, 0.0, 1.0, 10.0, 1.0),
    Block.box(0.0, 0.0, 0.0, 1.0, 10.0, 1.0),
    Block.box(15.0, 0.0, 0.0, 16.0, 10.0, 1.0),
    Block.box(0.0, 0.0, 15.0, 1.0, 10.0, 16.0),
    Block.box(15.0, 0.0, 15.0, 16.0, 10.0, 16.0)
)

class CrucibleInserterBlock(properties: Properties) : Block(properties) {
    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = SHAPE
}