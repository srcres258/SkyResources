package top.srcres258.renewal.skyresources.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

private val SHAPE: VoxelShape = Shapes.or(
    Block.box(2.0, 6.0, 2.0, 14.0, 12.0, 14.0),
    Block.box(4.0, 13.0, 4.0, 5.0, 16.0, 5.0),
    Block.box(11.0, 13.0, 4.0, 12.0, 16.0, 5.0),
    Block.box(11.0, 13.0, 11.0, 12.0, 16.0, 12.0),
    Block.box(4.0, 13.0, 11.0, 5.0, 16.0, 12.0),
    Block.box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
    Block.box(3.0, 12.0, 3.0, 13.0, 13.0, 13.0),
)

class LifeInjectorBlock(properties: Properties) : Block(properties) {
    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = SHAPE
}