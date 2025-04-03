package top.srcres258.renewal.skyresources.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

private val SHAPE: VoxelShape = Shapes.or(
    Block.box(4.0, 0.0, 4.0, 12.0, 1.0, 12.0),
    Block.box(7.0, 1.0, 7.0, 9.0, 6.0, 9.0)
)

class SilverfishTeleportationDisruptorBlock(properties: Properties) : Block(properties) {
    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = SHAPE
}