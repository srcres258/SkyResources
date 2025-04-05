package top.srcres258.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.neoforged.neoforge.common.data.BlockTagsProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.block.ModBlocks
import java.util.concurrent.CompletableFuture

class ModBlockTagsProvider(
    output: PackOutput,
    lookupProvider: CompletableFuture<HolderLookup.Provider>,
    existingFileHelper: ExistingFileHelper?
) : BlockTagsProvider(output, lookupProvider, SkyResources.MOD_ID, existingFileHelper) {
    override fun addTags(provider: HolderLookup.Provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.MAGMAFIED_STONE.get())
            .add(ModBlocks.BLAZE_POWDER_BLOCK.get())
            .add(ModBlocks.HARDENED_COAL_BLOCK.get())
            .add(ModBlocks.ALCHEMICAL_COAL_BLOCK.get())
            .add(ModBlocks.STONE_CASING.get())
            .add(ModBlocks.BRONZE_CASING.get())
            .add(ModBlocks.IRON_CASING.get())
            .add(ModBlocks.STEEL_CASING.get())
            .add(ModBlocks.ELECTRUM_CASING.get())
            .add(ModBlocks.NETHER_BRICK_CASING.get())
            .add(ModBlocks.LEAD_CASING.get())
            .add(ModBlocks.MANYULLYN_CASING.get())
            .add(ModBlocks.SIGNALUM_CASING.get())
            .add(ModBlocks.END_STONE_CASING.get())
            .add(ModBlocks.ENDERIUM_CASING.get())
            .add(ModBlocks.DARK_MATTER_CASING.get())
            .add(ModBlocks.LIGHT_MATTER_CASING.get())
            .add(ModBlocks.OSMIUM_CASING.get())
            .add(ModBlocks.REFINED_OBSIDIAN_CASING.get())

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(ModBlocks.SANDY_NETHERRACK.get())
            .add(ModBlocks.HEAVY_SNOW_BLOCK.get())

        tag(BlockTags.MINEABLE_WITH_AXE)
            .add(ModBlocks.PETRIFIED_WOOD.get())
            .add(ModBlocks.PRTIFIED_PLANKS.get())
            .add(ModBlocks.WOODEN_CASING.get())

        tag(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.MAGMAFIED_STONE.get())
            .add(ModBlocks.HARDENED_COAL_BLOCK.get())
            .add(ModBlocks.ALCHEMICAL_COAL_BLOCK.get())

        tag(BlockTags.SAND)
            .add(ModBlocks.SANDY_NETHERRACK.get())

        tag(BlockTags.ENDERMAN_HOLDABLE)
            .add(ModBlocks.DEHYDRATED_CACTUS.get())

        tag(BlockTags.SNAPS_GOAT_HORN)
            .add(ModBlocks.MAGMAFIED_STONE.get())

        tag(BlockTags.INFINIBURN_OVERWORLD)
            .add(ModBlocks.SANDY_NETHERRACK.get())

        tag(BlockTags.IMPERMEABLE)
            .add(ModBlocks.ALCHEMICAL_GLASS.get())

        tag(BlockTags.AZALEA_ROOT_REPLACEABLE)
            .add(ModBlocks.HEAVY_SNOW_BLOCK.get())

        tag(BlockTags.GOATS_SPAWNABLE_ON)
            .add(ModBlocks.MAGMAFIED_STONE.get())

        tag(BlockTags.RABBITS_SPAWNABLE_ON)
            .add(ModBlocks.HEAVY_SNOW_BLOCK.get())

        tag(BlockTags.FOXES_SPAWNABLE_ON)
            .add(ModBlocks.HEAVY_SNOW_BLOCK.get())

        tag(BlockTags.WOLVES_SPAWNABLE_ON)
            .add(ModBlocks.HEAVY_SNOW_BLOCK.get())

        tag(BlockTags.LOGS)
            .add(ModBlocks.PETRIFIED_WOOD.get())

        tag(BlockTags.PLANKS)
            .add(ModBlocks.PRTIFIED_PLANKS.get())

        cTag("glass_blocks/colorless")
            .add(ModBlocks.ALCHEMICAL_GLASS.get())
    }

    private fun cTag(name: String) =
        tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name)))
}