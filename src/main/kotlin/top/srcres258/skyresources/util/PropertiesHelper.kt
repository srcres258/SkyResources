package top.srcres258.skyresources.util

import net.minecraft.world.level.block.state.BlockBehaviour

fun BlockBehaviour.Properties.copy(): BlockBehaviour.Properties =
    BlockBehaviour.Properties.ofFullCopy(DummyBlockBehaviour(this))