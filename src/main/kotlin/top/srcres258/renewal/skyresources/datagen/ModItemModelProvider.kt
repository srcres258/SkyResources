package top.srcres258.renewal.skyresources.datagen

import net.minecraft.data.PackOutput
import net.neoforged.neoforge.client.model.generators.ItemModelProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.renewal.skyresources.SkyResources

class ModItemModelProvider(
    output: PackOutput,
    existingFileHelper: ExistingFileHelper
) : ItemModelProvider(output, SkyResources.MOD_ID, existingFileHelper) {
    override fun registerModels() {}
}