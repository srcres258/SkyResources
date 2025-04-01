package top.srcres258.renewal.skyresources.item

import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.block.ModBlocks
import java.util.function.Supplier

object ModCreativeModeTabs {
    val CREATIVE_MODE_TAB: DeferredRegister<CreativeModeTab> =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyResources.MOD_ID)

    val SKY_RESOURCES_TAB: Supplier<CreativeModeTab> = CREATIVE_MODE_TAB.register("sky_resources_tab") { ->
        CreativeModeTab.builder()
            .title(Component.translatable("creativetab.skyresources.sky_resources_tab"))
            .displayItems { parameters, output ->
                output.accept(ModBlocks.MAGMAFIED_STONE)
                output.accept(ModBlocks.SANDY_NETHERRACK)
                output.accept(ModBlocks.ALCHEMICAL_GLASS)
                output.accept(ModBlocks.BLAZE_POWDER_BLOCK)
                output.accept(ModBlocks.PETRIFIED_WOOD)
                output.accept(ModBlocks.PRTIFIED_PLANKS)
                output.accept(ModBlocks.HARDENED_COAL_BLOCK)
                output.accept(ModBlocks.DEHYDRATED_CACTUS)
                output.accept(ModBlocks.ALCHEMICAL_COAL_BLOCK)
                output.accept(ModBlocks.HEAVY_SNOW_BLOCK)

                output.accept(ModItems.PLANT_MATTER)
                output.accept(ModItems.ENRICHED_BONE_MEAL)
                output.accept(ModItems.HEAVY_SNOWBALL)
                output.accept(ModItems.EXPLOSIVE_HEAVY_SNOWBALL)
            }
            .build()
    }

    fun register(eventBus: IEventBus) {
        CREATIVE_MODE_TAB.register(eventBus)
    }
}