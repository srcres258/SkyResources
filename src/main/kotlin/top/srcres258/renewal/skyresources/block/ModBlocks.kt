package top.srcres258.renewal.skyresources.block

import net.minecraft.util.ColorRGBA
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.block.custom.DehydratedCactusBlock
import top.srcres258.renewal.skyresources.item.ModItems

object ModBlocks {
    val BLOCKS: DeferredRegister.Blocks = DeferredRegister.createBlocks(SkyResources.MOD_ID)

    val MAGMAFIED_STONE: DeferredBlock<Block> = registerBlockWithItem("magmafied_stone") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK))
    }
    val SANDY_NETHERRACK: DeferredBlock<Block> = registerBlockWithItem("sandy_netherrack") {
        ColoredFallingBlock(
            ColorRGBA(0xDBD3A0),
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.SAND)
                .instrument(NoteBlockInstrument.SNARE)
                .strength(0.5F)
                .sound(SoundType.SAND)
        )
    }
    val ALCHEMICAL_GLASS: DeferredBlock<Block> = registerBlockWithItem("alchemical_glass") {
        TransparentBlock(
            BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.HAT)
                .strength(0.3F)
                .sound(SoundType.GLASS)
                .noOcclusion()
                .isValidSpawn { _, _, _, _ -> false }
                .isRedstoneConductor { _, _, _ -> false }
                .isSuffocating { _, _, _ -> false }
                .isViewBlocking { _, _, _ -> false }
        )
    }
    val BLAZE_POWDER_BLOCK: DeferredBlock<Block> = registerBlockWithItem("blaze_powder_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.FIRE)
                .strength(0.5F)
                .sound(SoundType.METAL)
        )
    }
    val PETRIFIED_WOOD: DeferredBlock<Block> = registerBlockWithItem("petrified_wood") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(SoundType.WOOD)
        )
    }
    val PRTIFIED_PLANKS: DeferredBlock<Block> = registerBlockWithItem("petrified_planks") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F, 3.0F)
                .sound(SoundType.WOOD)
        )
    }
    val HARDENED_COAL_BLOCK: DeferredBlock<Block> = registerBlockWithItem("hardened_coal_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLACK)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
        )
    }
    val DEHYDRATED_CACTUS: DeferredBlock<Block> = registerBlockWithItem("dehydrated_cactus") {
        DehydratedCactusBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .strength(0.4F)
                .sound(SoundType.WOOL)
                .pushReaction(PushReaction.DESTROY) // Destroyed by pistons when pushed.
        )
    }
    val ALCHEMICAL_COAL_BLOCK: DeferredBlock<Block> = registerBlockWithItem("alchemical_coal_block") {
        Block(BlockBehaviour.Properties.ofFullCopy(HARDENED_COAL_BLOCK.get()))
    }
    val HEAVY_SNOW_BLOCK: DeferredBlock<Block> = registerBlockWithItem("heavy_snow_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.SNOW)
                .strength(0.2F)
                .sound(SoundType.SNOW)
        )
    }

    private fun <T : Block> registerBlockWithItem(name: String, block: () -> T) =
        BLOCKS.register(name, block).also { deferredBlock ->
            registerBlockItem(name, deferredBlock)
        }

    private fun <T : Block> registerBlockItem(name: String, block: DeferredBlock<T>) =
        ModItems.ITEMS.register(name) { ->
            BlockItem(block.get(), Item.Properties())
        }

    fun register(eventBus: IEventBus) {
        BLOCKS.register(eventBus)
    }
}