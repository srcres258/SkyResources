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

                output.accept(ModItems.WOODEN_HEAT_COMPONENT)
                output.accept(ModItems.STONE_HEAT_COMPONENT)
                output.accept(ModItems.BRONZE_HEAT_COMPONENT)
                output.accept(ModItems.IRON_HEAT_COMPONENT)
                output.accept(ModItems.STEEL_HEAT_COMPONENT)
                output.accept(ModItems.ELECTRUM_HEAT_COMPONENT)
                output.accept(ModItems.NETHER_BRICK_HEAT_COMPONENT)
                output.accept(ModItems.LEAD_HEAT_COMPONENT)
                output.accept(ModItems.MANYULLYN_HEAT_COMPONENT)
                output.accept(ModItems.SIGNALUM_HEAT_COMPONENT)
                output.accept(ModItems.END_STONE_HEAT_COMPONENT)
                output.accept(ModItems.ENDERIUM_HEAT_COMPONENT)
                output.accept(ModItems.DARK_MATTER_HEAT_COMPONENT)
                output.accept(ModItems.LIGHT_MATTER_HEAT_COMPONENT)
                output.accept(ModItems.OSMIUM_HEAT_COMPONENT)
                output.accept(ModItems.REFINED_OBSIDIAN_HEAT_COMPONENT)

                output.accept(ModItems.WOODEN_ALCHEMY_COMPONENT)
                output.accept(ModItems.STONE_ALCHEMY_COMPONENT)
                output.accept(ModItems.BRONZE_ALCHEMY_COMPONENT)
                output.accept(ModItems.IRON_ALCHEMY_COMPONENT)
                output.accept(ModItems.STEEL_ALCHEMY_COMPONENT)
                output.accept(ModItems.ELECTRUM_ALCHEMY_COMPONENT)
                output.accept(ModItems.NETHER_BRICK_ALCHEMY_COMPONENT)
                output.accept(ModItems.LEAD_ALCHEMY_COMPONENT)
                output.accept(ModItems.MANYULLYN_ALCHEMY_COMPONENT)
                output.accept(ModItems.SIGNALUM_ALCHEMY_COMPONENT)
                output.accept(ModItems.END_STONE_ALCHEMY_COMPONENT)
                output.accept(ModItems.ENDERIUM_ALCHEMY_COMPONENT)
                output.accept(ModItems.DARK_MATTER_ALCHEMY_COMPONENT)
                output.accept(ModItems.LIGHT_MATTER_ALCHEMY_COMPONENT)
                output.accept(ModItems.OSMIUM_ALCHEMY_COMPONENT)
                output.accept(ModItems.REFINED_OBSIDIAN_ALCHEMY_COMPONENT)

                output.accept(ModItems.QUARTZ_AMPLIFICATION_COMPONENT)
                output.accept(ModItems.ADVANCED_POWER_COMPONENT)
                output.accept(ModItems.FROZEN_IRON_COOLING_COMPONENT)
                output.accept(ModItems.FROZEN_IRON_INGOT)

                output.accept(ModItems.DIRTY_EMERALD)
                output.accept(ModItems.DIRTY_DIAMOND)
                output.accept(ModItems.DIRTY_RUBY)
                output.accept(ModItems.DIRTY_SAPPHIRE)
                output.accept(ModItems.DIRTY_PERIDOT)
                output.accept(ModItems.DIRTY_RED_GARNET)
                output.accept(ModItems.DIRTY_YELLOW_GARNET)
                output.accept(ModItems.DIRTY_APATITE)
                output.accept(ModItems.DIRTY_AMBER)
                output.accept(ModItems.DIRTY_LEPIDOLITE)
                output.accept(ModItems.DIRTY_MALACHITE)
                output.accept(ModItems.DIRTY_ONYX)
                output.accept(ModItems.DIRTY_MOLDAVITE)
                output.accept(ModItems.DIRTY_AGATE)
                output.accept(ModItems.DIRTY_OPAL)
                output.accept(ModItems.DIRTY_MORGANITE)
                output.accept(ModItems.DIRTY_AMETHYST)
                output.accept(ModItems.DIRTY_CARNELIAN)
                output.accept(ModItems.DIRTY_JASPER)
                output.accept(ModItems.DIRTY_BERYL)
                output.accept(ModItems.DIRTY_AQUAMARINE)
                output.accept(ModItems.DIRTY_GOLDEN_BERYL)
                output.accept(ModItems.DIRTY_HELIODOR)
                output.accept(ModItems.DIRTY_CITRINE)
                output.accept(ModItems.DIRTY_TURQUOISE)
                output.accept(ModItems.DIRTY_INDICOLITE)
                output.accept(ModItems.DIRTY_MOONSTONE)
                output.accept(ModItems.DIRTY_GARNET)
                output.accept(ModItems.DIRTY_TOPAZ)
                output.accept(ModItems.DIRTY_AMETRINE)
                output.accept(ModItems.DIRTY_TANZANITE)
                output.accept(ModItems.DIRTY_VIOLET_SAPPHIRE)
                output.accept(ModItems.DIRTY_ALEXANDRITE)
                output.accept(ModItems.DIRTY_BLUE_TOPAZ)
                output.accept(ModItems.DIRTY_SPINEL)
                output.accept(ModItems.DIRTY_IOLITE)
                output.accept(ModItems.DIRTY_BLACK_DIAMOND)
                output.accept(ModItems.DIRTY_CHAOS)
                output.accept(ModItems.DIRTY_ENDER_ESSENCE)
                output.accept(ModItems.DIRTY_DARK_GEM)
                output.accept(ModItems.DIRTY_QUARTZ)
                output.accept(ModItems.DIRTY_LAPIS_LAZULI)
                output.accept(ModItems.DIRTY_BLACK_QUARTZ)
                output.accept(ModItems.DIRTY_CERTUS_QUARTZ)

                output.accept(ModItems.CACTUS_NEEDLE)
                output.accept(ModItems.CACTUS_FRUIT_ON_A_NEEDLE)
                output.accept(ModItems.ALCHEMICAL_GOLD_NEEDLE)
                output.accept(ModItems.SAWDUST)
                output.accept(ModItems.CRUSHED_STONE)
                output.accept(ModItems.CRUSHED_NETHERRACK)
            }
            .build()
    }

    fun register(eventBus: IEventBus) {
        CREATIVE_MODE_TAB.register(eventBus)
    }
}