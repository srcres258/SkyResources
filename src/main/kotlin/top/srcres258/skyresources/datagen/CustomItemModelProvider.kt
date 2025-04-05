package top.srcres258.skyresources.datagen

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder
import net.neoforged.neoforge.client.model.generators.ModelFile
import net.neoforged.neoforge.client.model.generators.ModelProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.skyresources.SkyResources

abstract class CustomItemModelProvider(
    output: PackOutput,
    existingFileHelper: ExistingFileHelper,
    modId: String = SkyResources.MOD_ID
) : ModelProvider<ItemModelBuilder>(output, modId, ITEM_FOLDER, ::CustomItemModelBuilder, existingFileHelper) {
    fun basicItem(item: Item): ItemModelBuilder =
        basicItem(BuiltInRegistries.ITEM.getKey(item))

    fun basicItem(item: ResourceLocation): ItemModelBuilder =
        getBuilder(item.toString())
            .parent(ModelFile.UncheckedModelFile("item/generated"))
            .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.namespace, "item/" + item.path))

    override fun getName(): String = "Item Models: $modid"
}