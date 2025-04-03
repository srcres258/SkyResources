package top.srcres258.renewal.skyresources.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.BooleanOp
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

private val INSIDE: VoxelShape = Block.box(2.0, 4.0, 2.0, 14.0, 16.0, 14.0)
private val SHAPE: VoxelShape = Shapes.join(
    Shapes.block(),
    Shapes.or(
        Block.box(0.0, 0.0, 4.0, 16.0, 3.0, 12.0),
        Block.box(4.0, 0.0, 0.0, 12.0, 3.0, 16.0),
        Block.box(2.0, 0.0, 2.0, 14.0, 3.0, 14.0),
        INSIDE
    ),
    BooleanOp.ONLY_FIRST
)

class CrucibleBlock(properties: Properties) : Block(properties) {
    override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape = SHAPE
}