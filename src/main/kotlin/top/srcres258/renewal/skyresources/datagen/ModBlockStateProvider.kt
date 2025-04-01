package top.srcres258.renewal.skyresources.datagen

import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.client.model.generators.BlockStateProvider
import net.neoforged.neoforge.client.model.generators.ModelFile
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.block.ModBlocks

class ModBlockStateProvider(
    output: PackOutput,
    exFileHelper: ExistingFileHelper
) : BlockStateProvider(output, SkyResources.MOD_ID, exFileHelper) {
    override fun registerStatesAndModels() {
        blockWithItem(ModBlocks.MAGMAFIED_STONE.get())
        blockWithItem(ModBlocks.SANDY_NETHERRACK.get())
        blockWithItem(ModBlocks.ALCHEMICAL_GLASS.get())
        blockWithItem(ModBlocks.BLAZE_POWDER_BLOCK.get())
        blockWithItem(ModBlocks.PETRIFIED_WOOD.get())
        blockWithItem(ModBlocks.PRTIFIED_PLANKS.get())
        blockWithItem(ModBlocks.HARDENED_COAL_BLOCK.get())
        blockWithItem(ModBlocks.DEHYDRATED_CACTUS.get(), models().getExistingFile(modLoc("block/dehydrated_cactus")))
        blockWithItem(ModBlocks.ALCHEMICAL_COAL_BLOCK.get())
        blockWithItem(ModBlocks.HEAVY_SNOW_BLOCK.get())
    }

    private fun blockWithItem(block: Block, model: ModelFile = cubeAll(block)) {
        simpleBlockWithItem(block, model)
    }
}