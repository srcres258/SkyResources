package top.srcres258.renewal.skyresources.datagen

import net.minecraft.data.PackOutput
import net.neoforged.neoforge.client.model.generators.ItemModelProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.item.ModItems

class ModItemModelProvider(
    output: PackOutput,
    existingFileHelper: ExistingFileHelper
) : ItemModelProvider(output, SkyResources.MOD_ID, existingFileHelper) {
    override fun registerModels() {
        basicItem(ModItems.PLANT_MATTER.get())
        basicItem(ModItems.ENRICHED_BONE_MEAL.get())
        basicItem(ModItems.HEAVY_SNOWBALL.get())
        basicItem(ModItems.EXPLOSIVE_HEAVY_SNOWBALL.get())
    }
}