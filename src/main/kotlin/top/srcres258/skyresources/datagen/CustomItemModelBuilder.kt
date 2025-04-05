package top.srcres258.skyresources.datagen

import com.google.gson.JsonObject
import net.minecraft.resources.ResourceLocation
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder
import net.neoforged.neoforge.common.data.ExistingFileHelper

class CustomItemModelBuilder(
    outputLocation: ResourceLocation,
    existingFileHelper: ExistingFileHelper,
) : ItemModelBuilder(outputLocation, existingFileHelper) {
    var loader: ResourceLocation? = null
    var fluid: ResourceLocation? = null

    override fun toJson(): JsonObject =
        super.toJson().also { root ->
            loader?.let { loader ->
                root.addProperty("loader", loader.toString())
            }
            fluid?.let { fluid ->
                root.addProperty("fluid", fluid.toString())
            }
        }
}