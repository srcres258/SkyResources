package top.srcres258.renewal.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.data.loot.BlockLootSubProvider
import net.minecraft.world.flag.FeatureFlags
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue
import top.srcres258.renewal.skyresources.block.ModBlocks
import top.srcres258.renewal.skyresources.item.ModItems

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
        add(
            ModBlocks.HEAVY_SNOW_BLOCK.get(),
            createSingleItemTableWithSilkTouch(
                ModBlocks.HEAVY_SNOW_BLOCK.get(),
                ModItems.HEAVY_SNOWBALL.get(),
                ConstantValue.exactly(4F)
            )
        )

        dropSelf(ModBlocks.WOODEN_CASING.get())
        dropSelf(ModBlocks.STONE_CASING.get())
        dropSelf(ModBlocks.BRONZE_CASING.get())
        dropSelf(ModBlocks.IRON_CASING.get())
        dropSelf(ModBlocks.STEEL_CASING.get())
        dropSelf(ModBlocks.ELECTRUM_CASING.get())
        dropSelf(ModBlocks.NETHER_BRICK_CASING.get())
        dropSelf(ModBlocks.LEAD_CASING.get())
        dropSelf(ModBlocks.MANYULLYN_CASING.get())
        dropSelf(ModBlocks.SIGNALUM_CASING.get())
        dropSelf(ModBlocks.END_STONE_CASING.get())
        dropSelf(ModBlocks.ENDERIUM_CASING.get())
        dropSelf(ModBlocks.DARK_MATTER_CASING.get())
        dropSelf(ModBlocks.LIGHT_MATTER_CASING.get())
        dropSelf(ModBlocks.OSMIUM_CASING.get())
        dropSelf(ModBlocks.REFINED_OBSIDIAN_CASING.get())

        dropSelf(ModBlocks.DARK_MATTER_BLOCK.get())
        dropSelf(ModBlocks.LIGHT_MATTER_BLOCK.get())
        dropSelf(ModBlocks.SILVERFISH_TELEPORTATION_DISRUPTOR.get())
        dropSelf(ModBlocks.LIFE_INFUSER_CORE.get())
        dropSelf(ModBlocks.END_PORTAL_CORE.get())
        dropSelf(ModBlocks.COMBUSTION_COLLECTOR.get())
        dropSelf(ModBlocks.SMART_COMBUSTION_CONTROLLER.get())

        dropSelf(ModBlocks.DIRT_FURNACE.get())
        dropSelf(ModBlocks.CRUCIBLE.get())
        dropSelf(ModBlocks.FLUID_DROPPER.get())
        dropSelf(ModBlocks.QUICK_DROPPER.get())
        dropSelf(ModBlocks.CRUCIBLE_INSERTER.get())
        dropSelf(ModBlocks.LIFE_INJECTOR.get())

        dropSelf(ModBlocks.ROCK_CRUSHER.get())
        dropSelf(ModBlocks.ROCK_CLEANER.get())
        dropSelf(ModBlocks.AQUEOUS_CONCENTRATOR.get())
        dropSelf(ModBlocks.AQUEOUS_DECONCENTRATOR.get())
        dropSelf(ModBlocks.WILDLIFE_ATTRACTOR.get())
        dropSelf(ModBlocks.DARK_MATTER_TRANSFORMER.get())
    }

    override fun getKnownBlocks(): Iterable<Block> = Iterable {
        ModBlocks.BLOCKS.entries.map { it.value() }.iterator()
    }
}