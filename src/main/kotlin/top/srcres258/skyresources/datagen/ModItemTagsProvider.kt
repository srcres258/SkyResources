package top.srcres258.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.data.tags.ItemTagsProvider
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagEntry
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.common.data.ExistingFileHelper
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.item.ModItems
import java.util.concurrent.CompletableFuture

class ModItemTagsProvider(
    output: PackOutput,
    lookupProvider: CompletableFuture<HolderLookup.Provider>,
    blockTags: CompletableFuture<TagLookup<Block>>,
    existingFileHelper: ExistingFileHelper?
) : ItemTagsProvider(output, lookupProvider, blockTags, SkyResources.MOD_ID, existingFileHelper) {
    override fun addTags(provider: HolderLookup.Provider) {
        cTag("ingots/tin")
            .add(ModItems.TIN_INGOT.get())
        cTag("ingots/silver")
            .add(ModItems.SILVER_INGOT.get())
        cTag("ingots/zinc")
            .add(ModItems.ZINC_INGOT.get())
        cTag("ingots/nickel")
            .add(ModItems.NICKEL_INGOT.get())
        cTag("ingots/platinum")
            .add(ModItems.PLATINUM_INGOT.get())
        cTag("ingots/aluminum")
            .add(ModItems.ALUMINUM_INGOT.get())
        cTag("ingots/lead")
            .add(ModItems.LEAD_INGOT.get())
        cTag("ingots/cobalt")
            .add(ModItems.COBALT_INGOT.get())
        cTag("ingots/ardite")
            .add(ModItems.ARDITE_INGOT.get())
        cTag("ingots/osmium")
            .add(ModItems.OSMIUM_INGOT.get())
        cTag("ingots/draconium")
            .add(ModItems.DRACONIUM_INGOT.get())
        cTag("ingots/titanium")
            .add(ModItems.TITANIUM_INGOT.get())
        cTag("ingots/tungsten")
            .add(ModItems.TUNGSTEN_INGOT.get())
        cTag("ingots/chrome")
            .add(ModItems.CHROME_INGOT.get())
        cTag("ingots/iridium")
            .add(ModItems.IRIDIUM_INGOT.get())
        cTag("ingots/boron")
            .add(ModItems.BORON_INGOT.get())
        cTag("ingots/lithium")
            .add(ModItems.LITHIUM_INGOT.get())
        cTag("ingots/magnesium")
            .add(ModItems.MAGNESIUM_INGOT.get())
        cTag("ingots/mithril")
            .add(ModItems.MITHRIL_INGOT.get())
        cTag("ingots/yellorium")
            .add(ModItems.YELLORIUM_INGOT.get())
        cTag("ingots/uranium")
            .add(ModItems.URANIUM_INGOT.get())
        cTag("ingots/thorium")
            .add(ModItems.THORIUM_INGOT.get())

        cTag("ingots")
            .add(cTagEntry("ingots/tin"))
            .add(cTagEntry("ingots/silver"))
            .add(cTagEntry("ingots/zinc"))
            .add(cTagEntry("ingots/nickel"))
            .add(cTagEntry("ingots/platinum"))
            .add(cTagEntry("ingots/aluminum"))
            .add(cTagEntry("ingots/lead"))
            .add(cTagEntry("ingots/cobalt"))
            .add(cTagEntry("ingots/ardite"))
            .add(cTagEntry("ingots/osmium"))
            .add(cTagEntry("ingots/draconium"))
            .add(cTagEntry("ingots/titanium"))
            .add(cTagEntry("ingots/tungsten"))
            .add(cTagEntry("ingots/chrome"))
            .add(cTagEntry("ingots/iridium"))
            .add(cTagEntry("ingots/boron"))
            .add(cTagEntry("ingots/lithium"))
            .add(cTagEntry("ingots/magnesium"))
            .add(cTagEntry("ingots/mithril"))
            .add(cTagEntry("ingots/yellorium"))
            .add(cTagEntry("ingots/uranium"))
            .add(cTagEntry("ingots/thorium"))
    }

    private fun cTag(name: String) =
        tag(cTagKey(name))
}

private fun cTagKey(name: String) =
    ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name))

private fun cTagEntry(name: String, required: Boolean = false) =
    if (required) {
        TagEntry.tag(ResourceLocation.fromNamespaceAndPath("c", name))
    } else {
        TagEntry.optionalTag(ResourceLocation.fromNamespaceAndPath("c", name))
    }