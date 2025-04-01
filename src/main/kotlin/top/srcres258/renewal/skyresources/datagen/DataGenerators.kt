package top.srcres258.renewal.skyresources.datagen

import net.minecraft.data.loot.LootTableProvider
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent
import top.srcres258.renewal.skyresources.SkyResources

@EventBusSubscriber(modid = SkyResources.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
object DataGenerators {
    @SubscribeEvent
    fun onGatherData(event: GatherDataEvent) {
        val generator = event.generator
        val packOutput = generator.packOutput
        val existingFileHelper = event.existingFileHelper
        val lookupProvider = event.lookupProvider

        generator.addProvider(
            event.includeServer(),
            LootTableProvider(
                packOutput,
                setOf(),
                listOf(LootTableProvider.SubProviderEntry(::ModBlockLootTableProvider, LootContextParamSets.BLOCK)),
                lookupProvider
            )
        )
        generator.addProvider(event.includeServer(), ModRecipeProvider(packOutput, lookupProvider))

        val blockTagsProvider = ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper)
        val itemTagsProvider = ModItemTagsProvider(
            packOutput,
            lookupProvider,
            blockTagsProvider.contentsGetter(),
            existingFileHelper
        )
        generator.addProvider(event.includeServer(), blockTagsProvider)
        generator.addProvider(event.includeServer(), itemTagsProvider)

        generator.addProvider(event.includeServer(), ModDataMapProvider(packOutput, lookupProvider))

        generator.addProvider(event.includeClient(), ModItemModelProvider(packOutput, existingFileHelper))
        generator.addProvider(event.includeClient(), ModBlockStateProvider(packOutput, existingFileHelper))

        generator.addProvider(event.includeServer(), ModDatapackProvider(packOutput, lookupProvider))
        generator.addProvider(event.includeServer(), ModGlobalLootModifierProvider(packOutput, lookupProvider))
    }
}