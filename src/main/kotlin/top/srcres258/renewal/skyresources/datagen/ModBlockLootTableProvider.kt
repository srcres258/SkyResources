package top.srcres258.renewal.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.data.loot.BlockLootSubProvider
import net.minecraft.world.flag.FeatureFlags
import net.minecraft.world.level.block.Block
import top.srcres258.renewal.skyresources.block.ModBlocks

class ModBlockLootTableProvider(
    registries: HolderLookup.Provider
) : BlockLootSubProvider(setOf(), FeatureFlags.REGISTRY.allFlags(), registries) {
    override fun generate() {
        dropSelf(ModBlocks.MAGMAFIED_STONE.get())
        dropSelf(ModBlocks.SANDY_NETHERRACK.get())
        dropSelf(ModBlocks.ALCHEMICAL_GLASS.get())
        dropSelf(ModBlocks.BLAZE_POWDER_BLOCK.get())
        dropSelf(ModBlocks.PETRIFIED_WOOD.get())
        dropSelf(ModBlocks.PRTIFIED_PLANKS.get())
        dropSelf(ModBlocks.HARDENED_COAL_BLOCK.get())
        dropSelf(ModBlocks.DEHYDRATED_CACTUS.get())
        dropSelf(ModBlocks.ALCHEMICAL_COAL_BLOCK.get())
        dropSelf(ModBlocks.HEAVY_SNOW_BLOCK.get()) // TODO: Replace drops with heavy snow items when latter is ready
    }

    override fun getKnownBlocks(): Iterable<Block> = Iterable {
        ModBlocks.BLOCKS.entries.map { it.value() }.iterator()
    }
}