package top.srcres258.skyresources.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

private val SHAPE: VoxelShape = Shapes.or(
    Block.box(2.0, 4.0, 2.0, 14.0, 10.0, 14.0),
    Block.box(3.0, 1.0, 3.0, 4.0, 4.0, 4.0),
    Block.box(12.0, 1.0, 3.0, 13.0, 4.0, 4.0),
    Block.box(12.0, 1.0, 12.0, 13.0, 4.0, 13.0),
    Block.box(3.0, 1.0, 12.0, 4.0, 4.0, 13.0),
    Block.box(4.0, 0.0, 7.0, 12.0, 4.0, 9.0),
    Block.box(5.0, 0.0, 9.0, 11.0, 4.0, 10.0),
    Block.box(5.0, 0.0, 6.0, 11.0, 4.0, 7.0),
    Block.box(6.0, 0.0, 5.0, 10.0, 4.0, 6.0),
    Block.box(6.0, 0.0, 10.0, 10.0, 4.0, 11.0),
    Block.box(7.0, 0.0, 11.0, 9.0, 4.0, 12.0),
    Block.box(7.0, 0.0, 4.0, 9.0, 4.0, 5.0),
    Block.box(0.0, 10.0, 0.0, 16.0, 16.0, 16.0)
)

class LifeInfuserCoreBlock(properties: Properties) : Block(properties) {
    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = SHAPE
}