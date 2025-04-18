package top.srcres258.skyresources.item

import net.minecraft.world.item.BucketItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.block.ModFluids
import top.srcres258.skyresources.item.custom.*
import top.srcres258.skyresources.util.*

object ModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(SkyResources.MOD_ID)

    // ----- Basic Items -----

    val PLANT_MATTER: DeferredItem<Item> = registerItem("plant_matter") {
        Item(Item.Properties())
    }
    val ENRICHED_BONE_MEAL: DeferredItem<Item> = registerItem("enriched_bone_meal") {
        Item(Item.Properties())
    }
    val HEAVY_SNOWBALL: DeferredItem<Item> = registerItem("heavy_snowball") {
        HeavySnowballItem(Item.Properties().stacksTo(8))
    }
    val EXPLOSIVE_HEAVY_SNOWBALL: DeferredItem<Item> = registerItem("explosive_heavy_snowball") {
        ExplosiveHeavySnowballItem(Item.Properties().stacksTo(8))
    }

    // ----- Material Items -----

    val WOODEN_HEAT_COMPONENT: DeferredItem<Item> = registerItem("wooden_heat_component") {
        HeatComponentItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val STONE_HEAT_COMPONENT: DeferredItem<Item> = registerItem("stone_heat_component") {
        HeatComponentItem(
            MaterialType.STONE,
            Item.Properties()
        )
    }
    val BRONZE_HEAT_COMPONENT: DeferredItem<Item> = registerItem("bronze_heat_component") {
        HeatComponentItem(
            MaterialType.BRONZE,
            Item.Properties()
        )
    }
    val IRON_HEAT_COMPONENT: DeferredItem<Item> = registerItem("iron_heat_component") {
        HeatComponentItem(
            MaterialType.IRON,
            Item.Properties()
        )
    }
    val STEEL_HEAT_COMPONENT: DeferredItem<Item> = registerItem("steel_heat_component") {
        HeatComponentItem(
            MaterialType.STEEL,
            Item.Properties()
        )
    }
    val ELECTRUM_HEAT_COMPONENT: DeferredItem<Item> = registerItem("electrum_heat_component") {
        HeatComponentItem(
            MaterialType.ELECTRUM,
            Item.Properties()
        )
    }
    val NETHER_BRICK_HEAT_COMPONENT: DeferredItem<Item> = registerItem("nether_brick_heat_component") {
        HeatComponentItem(
            MaterialType.NETHER_BRICK,
            Item.Properties()
        )
    }
    val LEAD_HEAT_COMPONENT: DeferredItem<Item> = registerItem("lead_heat_component") {
        HeatComponentItem(
            MaterialType.LEAD,
            Item.Properties()
        )
    }
    val MANYULLYN_HEAT_COMPONENT: DeferredItem<Item> = registerItem("manyullyn_heat_component") {
        HeatComponentItem(
            MaterialType.MANYULLYN,
            Item.Properties()
        )
    }
    val SIGNALUM_HEAT_COMPONENT: DeferredItem<Item> = registerItem("signalum_heat_component") {
        HeatComponentItem(
            MaterialType.SIGNALUM,
            Item.Properties()
        )
    }
    val END_STONE_HEAT_COMPONENT: DeferredItem<Item> = registerItem("end_stone_heat_component") {
        HeatComponentItem(
            MaterialType.END_STONE,
            Item.Properties()
        )
    }
    val ENDERIUM_HEAT_COMPONENT: DeferredItem<Item> = registerItem("enderium_heat_component") {
        HeatComponentItem(
            MaterialType.ENDERIUM,
            Item.Properties()
        )
    }
    val DARK_MATTER_HEAT_COMPONENT: DeferredItem<Item> = registerItem("dark_matter_heat_component") {
        HeatComponentItem(
            MaterialType.DARK_MATTER,
            Item.Properties()
        )
    }
    val LIGHT_MATTER_HEAT_COMPONENT: DeferredItem<Item> = registerItem("light_matter_heat_component") {
        HeatComponentItem(
            MaterialType.LIGHT_MATTER,
            Item.Properties()
        )
    }
    val OSMIUM_HEAT_COMPONENT: DeferredItem<Item> = registerItem("osmium_heat_component") {
        HeatComponentItem(
            MaterialType.OSMIUM,
            Item.Properties()
        )
    }
    val REFINED_OBSIDIAN_HEAT_COMPONENT: DeferredItem<Item> = registerItem("refined_obsidian_heat_component") {
        HeatComponentItem(
            MaterialType.REFINED_OBSIDIAN,
            Item.Properties()
        )
    }

    val WOODEN_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("wooden_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val STONE_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("stone_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.STONE,
            Item.Properties()
        )
    }
    val BRONZE_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("bronze_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.BRONZE,
            Item.Properties()
        )
    }
    val IRON_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("iron_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.IRON,
            Item.Properties()
        )
    }
    val STEEL_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("steel_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.STEEL,
            Item.Properties()
        )
    }
    val ELECTRUM_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("electrum_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.ELECTRUM,
            Item.Properties()
        )
    }
    val NETHER_BRICK_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("nether_brick_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.NETHER_BRICK,
            Item.Properties()
        )
    }
    val LEAD_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("lead_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.LEAD,
            Item.Properties()
        )
    }
    val MANYULLYN_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("manyullyn_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.MANYULLYN,
            Item.Properties()
        )
    }
    val SIGNALUM_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("signalum_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.SIGNALUM,
            Item.Properties()
        )
    }
    val END_STONE_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("end_stone_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.END_STONE,
            Item.Properties()
        )
    }
    val ENDERIUM_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("enderium_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.ENDERIUM,
            Item.Properties()
        )
    }
    val DARK_MATTER_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("dark_matter_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.DARK_MATTER,
            Item.Properties()
        )
    }
    val LIGHT_MATTER_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("light_matter_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.LIGHT_MATTER,
            Item.Properties()
        )
    }
    val OSMIUM_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("osmium_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.OSMIUM,
            Item.Properties()
        )
    }
    val REFINED_OBSIDIAN_ALCHEMY_COMPONENT: DeferredItem<Item> = registerItem("refined_obsidian_alchemy_component") {
        AlchemyComponentItem(
            MaterialType.REFINED_OBSIDIAN,
            Item.Properties()
        )
    }

    val QUARTZ_AMPLIFICATION_COMPONENT: DeferredItem<Item> = registerItem("quartz_amplification_component") {
        Item(Item.Properties())
    }
    val ADVANCED_POWER_COMPONENT: DeferredItem<Item> = registerItem("advanced_power_component") {
        Item(Item.Properties())
    }
    val FROZEN_IRON_COOLING_COMPONENT: DeferredItem<Item> = registerItem("frozen_iron_cooling_component") {
        Item(Item.Properties())
    }
    val FROZEN_IRON_INGOT: DeferredItem<Item> = registerItem("frozen_iron_ingot") {
        Item(Item.Properties())
    }

    val DIRTY_EMERALD: DeferredItem<Item> = registerItem("dirty_emerald") {
        DirtyGemItem(
            GemType.EMERALD,
            Item.Properties()
        )
    }
    val DIRTY_DIAMOND: DeferredItem<Item> = registerItem("dirty_diamond") {
        DirtyGemItem(
            GemType.DIAMOND,
            Item.Properties()
        )
    }
    val DIRTY_RUBY: DeferredItem<Item> = registerItem("dirty_ruby") {
        DirtyGemItem(
            GemType.RUBY,
            Item.Properties()
        )
    }
    val DIRTY_SAPPHIRE: DeferredItem<Item> = registerItem("dirty_sapphire") {
        DirtyGemItem(
            GemType.SAPPHIRE,
            Item.Properties()
        )
    }
    val DIRTY_PERIDOT: DeferredItem<Item> = registerItem("dirty_peridot") {
        DirtyGemItem(
            GemType.PERIDOT,
            Item.Properties()
        )
    }
    val DIRTY_RED_GARNET: DeferredItem<Item> = registerItem("dirty_red_garnet") {
        DirtyGemItem(
            GemType.RED_GARNET,
            Item.Properties()
        )
    }
    val DIRTY_YELLOW_GARNET: DeferredItem<Item> = registerItem("dirty_yellow_garnet") {
        DirtyGemItem(
            GemType.YELLOW_GARNET,
            Item.Properties()
        )
    }
    val DIRTY_APATITE: DeferredItem<Item> = registerItem("dirty_apatite") {
        DirtyGemItem(
            GemType.APATITE,
            Item.Properties()
        )
    }
    val DIRTY_AMBER: DeferredItem<Item> = registerItem("dirty_amber") {
        DirtyGemItem(
            GemType.AMBER,
            Item.Properties()
        )
    }
    val DIRTY_LEPIDOLITE: DeferredItem<Item> = registerItem("dirty_lepidolite") {
        DirtyGemItem(
            GemType.LEPIDOLITE,
            Item.Properties()
        )
    }
    val DIRTY_MALACHITE: DeferredItem<Item> = registerItem("dirty_malachite") {
        DirtyGemItem(
            GemType.MALACHITE,
            Item.Properties()
        )
    }
    val DIRTY_ONYX: DeferredItem<Item> = registerItem("dirty_onyx") {
        DirtyGemItem(
            GemType.ONYX,
            Item.Properties()
        )
    }
    val DIRTY_MOLDAVITE: DeferredItem<Item> = registerItem("dirty_moldavite") {
        DirtyGemItem(
            GemType.MOLDAVITE,
            Item.Properties()
        )
    }
    val DIRTY_AGATE: DeferredItem<Item> = registerItem("dirty_agate") {
        DirtyGemItem(
            GemType.AGATE,
            Item.Properties()
        )
    }
    val DIRTY_OPAL: DeferredItem<Item> = registerItem("dirty_opal") {
        DirtyGemItem(
            GemType.OPAL,
            Item.Properties()
        )
    }
    val DIRTY_MORGANITE: DeferredItem<Item> = registerItem("dirty_morganite") {
        DirtyGemItem(
            GemType.MORGANITE,
            Item.Properties()
        )
    }
    val DIRTY_AMETHYST: DeferredItem<Item> = registerItem("dirty_amethyst") {
        DirtyGemItem(
            GemType.AMETHYST,
            Item.Properties()
        )
    }
    val DIRTY_CARNELIAN: DeferredItem<Item> = registerItem("dirty_carnelian") {
        DirtyGemItem(
            GemType.CARNELIAN,
            Item.Properties()
        )
    }
    val DIRTY_JASPER: DeferredItem<Item> = registerItem("dirty_jasper") {
        DirtyGemItem(
            GemType.JASPER,
            Item.Properties()
        )
    }
    val DIRTY_BERYL: DeferredItem<Item> = registerItem("dirty_beryl") {
        DirtyGemItem(
            GemType.BERYL,
            Item.Properties()
        )
    }
    val DIRTY_AQUAMARINE: DeferredItem<Item> = registerItem("dirty_aquamarine") {
        DirtyGemItem(
            GemType.AQUAMARINE,
            Item.Properties()
        )
    }
    val DIRTY_GOLDEN_BERYL: DeferredItem<Item> = registerItem("dirty_golden_beryl") {
        DirtyGemItem(
            GemType.GOLDEN_BERYL,
            Item.Properties()
        )
    }
    val DIRTY_HELIODOR: DeferredItem<Item> = registerItem("dirty_heliodor") {
        DirtyGemItem(
            GemType.HELIODOR,
            Item.Properties()
        )
    }
    val DIRTY_CITRINE: DeferredItem<Item> = registerItem("dirty_citrine") {
        DirtyGemItem(
            GemType.CITRINE,
            Item.Properties()
        )
    }
    val DIRTY_TURQUOISE: DeferredItem<Item> = registerItem("dirty_turquoise") {
        DirtyGemItem(
            GemType.TURQUOISE,
            Item.Properties()
        )
    }
    val DIRTY_INDICOLITE: DeferredItem<Item> = registerItem("dirty_indicolite") {
        DirtyGemItem(
            GemType.INDICOLITE,
            Item.Properties()
        )
    }
    val DIRTY_MOONSTONE: DeferredItem<Item> = registerItem("dirty_moonstone") {
        DirtyGemItem(
            GemType.MOONSTONE,
            Item.Properties()
        )
    }
    val DIRTY_GARNET: DeferredItem<Item> = registerItem("dirty_garnet") {
        DirtyGemItem(
            GemType.GARNET,
            Item.Properties()
        )
    }
    val DIRTY_TOPAZ: DeferredItem<Item> = registerItem("dirty_topaz") {
        DirtyGemItem(
            GemType.TOPAZ,
            Item.Properties()
        )
    }
    val DIRTY_AMETRINE: DeferredItem<Item> = registerItem("dirty_ametrine") {
        DirtyGemItem(
            GemType.AMETRINE,
            Item.Properties()
        )
    }
    val DIRTY_TANZANITE: DeferredItem<Item> = registerItem("dirty_tanzanite") {
        DirtyGemItem(
            GemType.TANZANITE,
            Item.Properties()
        )
    }
    val DIRTY_VIOLET_SAPPHIRE: DeferredItem<Item> = registerItem("dirty_violet_sapphire") {
        DirtyGemItem(
            GemType.VIOLET_SAPPHIRE,
            Item.Properties()
        )
    }
    val DIRTY_ALEXANDRITE: DeferredItem<Item> = registerItem("dirty_alexandrite") {
        DirtyGemItem(
            GemType.ALEXANDRITE,
            Item.Properties()
        )
    }
    val DIRTY_BLUE_TOPAZ: DeferredItem<Item> = registerItem("dirty_blue_topaz") {
        DirtyGemItem(
            GemType.BLUE_TOPAZ,
            Item.Properties()
        )
    }
    val DIRTY_SPINEL: DeferredItem<Item> = registerItem("dirty_spinel") {
        DirtyGemItem(
            GemType.SPINEL,
            Item.Properties()
        )
    }
    val DIRTY_IOLITE: DeferredItem<Item> = registerItem("dirty_iolite") {
        DirtyGemItem(
            GemType.IOLITE,
            Item.Properties()
        )
    }
    val DIRTY_BLACK_DIAMOND: DeferredItem<Item> = registerItem("dirty_black_diamond") {
        DirtyGemItem(
            GemType.BLACK_DIAMOND,
            Item.Properties()
        )
    }
    val DIRTY_CHAOS: DeferredItem<Item> = registerItem("dirty_chaos") {
        DirtyGemItem(
            GemType.CHAOS,
            Item.Properties()
        )
    }
    val DIRTY_ENDER_ESSENCE: DeferredItem<Item> = registerItem("dirty_ender_essence") {
        DirtyGemItem(
            GemType.ENDER_ESSENCE,
            Item.Properties()
        )
    }
    val DIRTY_DARK_GEM: DeferredItem<Item> = registerItem("dirty_dark_gem") {
        DirtyGemItem(
            GemType.DARK_GEM,
            Item.Properties()
        )
    }
    val DIRTY_QUARTZ: DeferredItem<Item> = registerItem("dirty_quartz") {
        DirtyGemItem(
            GemType.QUARTZ,
            Item.Properties()
        )
    }
    val DIRTY_LAPIS_LAZULI: DeferredItem<Item> = registerItem("dirty_lapis_lazuli") {
        DirtyGemItem(
            GemType.LAPIS_LAZULI,
            Item.Properties()
        )
    }
    val DIRTY_BLACK_QUARTZ: DeferredItem<Item> = registerItem("dirty_black_quartz") {
        DirtyGemItem(
            GemType.BLACK_QUARTZ,
            Item.Properties()
        )
    }
    val DIRTY_CERTUS_QUARTZ: DeferredItem<Item> = registerItem("dirty_certus_quartz") {
        DirtyGemItem(
            GemType.CERTUS_QUARTZ,
            Item.Properties()
        )
    }

    val CACTUS_NEEDLE: DeferredItem<Item> = registerItem("cactus_needle") {
        Item(Item.Properties())
    }
    val CACTUS_FRUIT_ON_A_NEEDLE: DeferredItem<Item> = registerItem("cactus_fruit_on_a_needle") {
        Item(Item.Properties())
    }
    val ALCHEMICAL_GOLD_NEEDLE: DeferredItem<Item> = registerItem("alchemical_gold_needle") {
        Item(Item.Properties())
    }
    val SAWDUST: DeferredItem<Item> = registerItem("sawdust") {
        Item(Item.Properties())
    }
    val CRUSHED_STONE: DeferredItem<Item> = registerItem("crushed_stone") {
        Item(Item.Properties())
    }
    val CRUSHED_NETHERRACK: DeferredItem<Item> = registerItem("crushed_netherrack") {
        Item(Item.Properties())
    }

    // ----- Alchemical Items -----

    val RADIOACTIVE_POWDER_MIXTURE: DeferredItem<Item> = registerItem("radioactive_powder_mixture") {
        Item(Item.Properties())
    }

    val IRON_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("iron_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.IRON,
            Item.Properties()
        )
    }
    val GOLD_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("gold_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.GOLD,
            Item.Properties()
        )
    }
    val COPPER_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("copper_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.COPPER,
            Item.Properties()
        )
    }
    val TIN_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("tin_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.TIN,
            Item.Properties()
        )
    }
    val SILVER_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("silver_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.SILVER,
            Item.Properties()
        )
    }
    val ZINC_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("zinc_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.ZINC,
            Item.Properties()
        )
    }
    val NICKEL_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("nickel_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.NICKEL,
            Item.Properties()
        )
    }
    val PLATINUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("platinum_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.PLATINUM,
            Item.Properties()
        )
    }
    val ALUMINUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("aluminum_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.ALUMINUM,
            Item.Properties()
        )
    }
    val LEAD_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("lead_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.LEAD,
            Item.Properties()
        )
    }
    val COBALT_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("cobalt_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.COBALT,
            Item.Properties()
        )
    }
    val ARDITE_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("ardite_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.ARDITE,
            Item.Properties()
        )
    }
    val OSMIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("osmium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.OSMIUM,
            Item.Properties()
        )
    }
    val DRACONIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("draconium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.DRACONIUM,
            Item.Properties()
        )
    }
    val TITANIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("titanium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.TITANIUM,
            Item.Properties()
        )
    }
    val TUNGSTEN_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("tungsten_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.TUNGSTEN,
            Item.Properties()
        )
    }
    val CHROME_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("chrome_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.CHROME,
            Item.Properties()
        )
    }
    val IRIDIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("iridium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.IRIDIUM,
            Item.Properties()
        )
    }
    val BORON_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("boron_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.BORON,
            Item.Properties()
        )
    }
    val LITHIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("lithium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.LITHIUM,
            Item.Properties()
        )
    }
    val MAGNESIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("magnesium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.MAGNESIUM,
            Item.Properties()
        )
    }
    val MITHRIL_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("mithril_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.MITHRIL,
            Item.Properties()
        )
    }
    val YELLORIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("yellorium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.YELLORIUM,
            Item.Properties()
        )
    }
    val URANIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("uranium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.URANIUM,
            Item.Properties()
        )
    }
    val THORIUM_ALCHEMICAL_ORE_DUST: DeferredItem<Item> = registerItem("thorium_alchemical_ore_dust") {
        AlchemicalOreDustItem(
            OreType.THORIUM,
            Item.Properties()
        )
    }

    val PRIMUS_ALCHEMICAL_DUST: DeferredItem<Item> = registerItem("primus_alchemical_dust") {
        AlchemicalDustItem(
            AlchemicalLevel.PRIMUS,
            Item.Properties()
        )
    }
    val SECUNDUS_ALCHEMICAL_DUST: DeferredItem<Item> = registerItem("secundus_alchemical_dust") {
        AlchemicalDustItem(
            AlchemicalLevel.SECUNDUS,
            Item.Properties()
        )
    }
    val TERTIUS_ALCHEMICAL_DUST: DeferredItem<Item> = registerItem("tertius_alchemical_dust") {
        AlchemicalDustItem(
            AlchemicalLevel.TERTIUS,
            Item.Properties()
        )
    }
    val QUARTUS_ALCHEMICAL_DUST: DeferredItem<Item> = registerItem("quartus_alchemical_dust") {
        AlchemicalDustItem(
            AlchemicalLevel.QUARTUS,
            Item.Properties()
        )
    }

    val ALCHEMICAL_COAL: DeferredItem<Item> = registerItem("alchemical_coal") {
        Item(Item.Properties())
    }
    val ALCHEMICAL_GOLD_INGOT: DeferredItem<Item> = registerItem("alchemical_gold_ingot") {
        Item(Item.Properties())
    }
    val ALCHEMICAL_IRON_INGOT: DeferredItem<Item> = registerItem("alchemical_iron_ingot") {
        Item(Item.Properties())
    }
    val ALCHEMICAL_DIAMOND: DeferredItem<Item> = registerItem("alchemical_diamond") {
        Item(Item.Properties())
    }
    val DARK_MATTER: DeferredItem<Item> = registerItem("dark_matter") {
        Item(Item.Properties())
    }
    val LIGHT_MATTER: DeferredItem<Item> = registerItem("light_matter") {
        Item(Item.Properties())
    }
    val CRYSTAL_SHARD: DeferredItem<Item> = registerItem("crystal_shard") {
        Item(Item.Properties())
    }

    // ----- Energy-consuming Device Items -----

    val WOODEN_HEAT_PROVIDER: DeferredItem<Item> = registerItem("wooden_heat_provider") {
        HeatProviderItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val STONE_HEAT_PROVIDER: DeferredItem<Item> = registerItem("stone_heat_provider") {
        HeatProviderItem(
            MaterialType.STONE,
            Item.Properties()
        )
    }
    val BRONZE_HEAT_PROVIDER: DeferredItem<Item> = registerItem("bronze_heat_provider") {
        HeatProviderItem(
            MaterialType.BRONZE,
            Item.Properties()
        )
    }
    val IRON_HEAT_PROVIDER: DeferredItem<Item> = registerItem("iron_heat_provider") {
        HeatProviderItem(
            MaterialType.IRON,
            Item.Properties()
        )
    }
    val STEEL_HEAT_PROVIDER: DeferredItem<Item> = registerItem("steel_heat_provider") {
        HeatProviderItem(
            MaterialType.STEEL,
            Item.Properties()
        )
    }
    val ELECTRUM_HEAT_PROVIDER: DeferredItem<Item> = registerItem("electrum_heat_provider") {
        HeatProviderItem(
            MaterialType.ELECTRUM,
            Item.Properties()
        )
    }
    val NETHER_BRICK_HEAT_PROVIDER: DeferredItem<Item> = registerItem("nether_brick_heat_provider") {
        HeatProviderItem(
            MaterialType.NETHER_BRICK,
            Item.Properties()
        )
    }
    val LEAD_HEAT_PROVIDER: DeferredItem<Item> = registerItem("lead_heat_provider") {
        HeatProviderItem(
            MaterialType.LEAD,
            Item.Properties()
        )
    }
    val MANYULLYN_HEAT_PROVIDER: DeferredItem<Item> = registerItem("manyullyn_heat_provider") {
        HeatProviderItem(
            MaterialType.MANYULLYN,
            Item.Properties()
        )
    }
    val SIGNALUM_HEAT_PROVIDER: DeferredItem<Item> = registerItem("signalum_heat_provider") {
        HeatProviderItem(
            MaterialType.SIGNALUM,
            Item.Properties()
        )
    }
    val END_STONE_HEAT_PROVIDER: DeferredItem<Item> = registerItem("end_stone_heat_provider") {
        HeatProviderItem(
            MaterialType.END_STONE,
            Item.Properties()
        )
    }
    val ENDERIUM_HEAT_PROVIDER: DeferredItem<Item> = registerItem("enderium_heat_provider") {
        HeatProviderItem(
            MaterialType.ENDERIUM,
            Item.Properties()
        )
    }
    val DARK_MATTER_HEAT_PROVIDER: DeferredItem<Item> = registerItem("dark_matter_heat_provider") {
        HeatProviderItem(
            MaterialType.DARK_MATTER,
            Item.Properties()
        )
    }
    val LIGHT_MATTER_HEAT_PROVIDER: DeferredItem<Item> = registerItem("light_matter_heat_provider") {
        HeatProviderItem(
            MaterialType.LIGHT_MATTER,
            Item.Properties()
        )
    }
    val OSMIUM_HEAT_PROVIDER: DeferredItem<Item> = registerItem("osmium_heat_provider") {
        HeatProviderItem(
            MaterialType.OSMIUM,
            Item.Properties()
        )
    }
    val REFINED_OBSIDIAN_HEAT_PROVIDER: DeferredItem<Item> = registerItem("refined_obsidian_heat_provider") {
        HeatProviderItem(
            MaterialType.REFINED_OBSIDIAN,
            Item.Properties()
        )
    }

    // ----- Crafting Device Items -----

    val WOODEN_CONDENSER: DeferredItem<Item> = registerItem("wooden_condenser") {
        CondenserItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val STONE_CONDENSER: DeferredItem<Item> = registerItem("stone_condenser") {
        CondenserItem(
            MaterialType.STONE,
            Item.Properties()
        )
    }
    val BRONZE_CONDENSER: DeferredItem<Item> = registerItem("bronze_condenser") {
        CondenserItem(
            MaterialType.BRONZE,
            Item.Properties()
        )
    }
    val IRON_CONDENSER: DeferredItem<Item> = registerItem("iron_condenser") {
        CondenserItem(
            MaterialType.IRON,
            Item.Properties()
        )
    }
    val STEEL_CONDENSER: DeferredItem<Item> = registerItem("steel_condenser") {
        CondenserItem(
            MaterialType.STEEL,
            Item.Properties()
        )
    }
    val ELECTRUM_CONDENSER: DeferredItem<Item> = registerItem("electrum_condenser") {
        CondenserItem(
            MaterialType.ELECTRUM,
            Item.Properties()
        )
    }
    val NETHER_BRICK_CONDENSER: DeferredItem<Item> = registerItem("nether_brick_condenser") {
        CondenserItem(
            MaterialType.NETHER_BRICK,
            Item.Properties()
        )
    }
    val LEAD_CONDENSER: DeferredItem<Item> = registerItem("lead_condenser") {
        CondenserItem(
            MaterialType.LEAD,
            Item.Properties()
        )
    }
    val MANYULLYN_CONDENSER: DeferredItem<Item> = registerItem("manyullyn_condenser") {
        CondenserItem(
            MaterialType.MANYULLYN,
            Item.Properties()
        )
    }
    val SIGNALUM_CONDENSER: DeferredItem<Item> = registerItem("signalum_condenser") {
        CondenserItem(
            MaterialType.SIGNALUM,
            Item.Properties()
        )
    }
    val END_STONE_CONDENSER: DeferredItem<Item> = registerItem("end_stone_condenser") {
        CondenserItem(
            MaterialType.END_STONE,
            Item.Properties()
        )
    }
    val ENDERIUM_CONDENSER: DeferredItem<Item> = registerItem("enderium_condenser") {
        CondenserItem(
            MaterialType.ENDERIUM,
            Item.Properties()
        )
    }
    val DARK_MATTER_CONDENSER: DeferredItem<Item> = registerItem("dark_matter_condenser") {
        CondenserItem(
            MaterialType.DARK_MATTER,
            Item.Properties()
        )
    }
    val LIGHT_MATTER_CONDENSER: DeferredItem<Item> = registerItem("light_matter_condenser") {
        CondenserItem(
            MaterialType.LIGHT_MATTER,
            Item.Properties()
        )
    }
    val OSMIUM_CONDENSER: DeferredItem<Item> = registerItem("osmium_condenser") {
        CondenserItem(
            MaterialType.OSMIUM,
            Item.Properties()
        )
    }
    val REFINED_OBSIDIAN_CONDENSER: DeferredItem<Item> = registerItem("refined_obsidian_condenser") {
        CondenserItem(
            MaterialType.REFINED_OBSIDIAN,
            Item.Properties()
        )
    }

    val WOODEN_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("wooden_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val STONE_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("stone_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.STONE,
            Item.Properties()
        )
    }
    val BRONZE_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("bronze_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.BRONZE,
            Item.Properties()
        )
    }
    val IRON_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("iron_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.IRON,
            Item.Properties()
        )
    }
    val STEEL_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("steel_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.STEEL,
            Item.Properties()
        )
    }
    val ELECTRUM_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("electrum_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.WOOD,
            Item.Properties()
        )
    }
    val NETHER_BRICK_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("nether_brick_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.NETHER_BRICK,
            Item.Properties()
        )
    }
    val LEAD_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("lead_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.LEAD,
            Item.Properties()
        )
    }
    val MANYULLYN_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("manyullyn_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.MANYULLYN,
            Item.Properties()
        )
    }
    val SIGNALUM_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("signalum_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.SIGNALUM,
            Item.Properties()
        )
    }
    val END_STONE_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("end_stone_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.END_STONE,
            Item.Properties()
        )
    }
    val ENDERIUM_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("enderium_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.ENDERIUM,
            Item.Properties()
        )
    }
    val DARK_MATTER_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("dark_matter_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.DARK_MATTER,
            Item.Properties()
        )
    }
    val LIGHT_MATTER_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("light_matter_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.LIGHT_MATTER,
            Item.Properties()
        )
    }
    val OSMIUM_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("osmium_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.OSMIUM,
            Item.Properties()
        )
    }
    val REFINED_OBSIDIAN_COMBUSTION_HEATER: DeferredItem<Item> = registerItem("refined_obsidian_combustion_heater") {
        CombustionHeaterItem(
            MaterialType.REFINED_OBSIDIAN,
            Item.Properties()
        )
    }

    // ----- Tool Items -----

    val WATER_EXTRACTOR: DeferredItem<Item> = registerItem("water_extractor") {
        Item(Item.Properties().stacksTo(1))
    }
    val HEALTH_GEM: DeferredItem<Item> = registerItem("health_gem") {
        Item(Item.Properties().stacksTo(1))
    }
    val SURVIVALIST_FISHING_ROD: DeferredItem<Item> = registerItem("survivalist_fishing_rod") {
        Item(Item.Properties().stacksTo(1))
    }

    // ----- World Crafting Tool Items -----

    val SANDSTONE_INFUSION_STONE: DeferredItem<Item> = registerItem("sandstone_infusion_stone") {
        InfusionStoneItem(
            InfusionStoneType.SANDSTONE,
            Item.Properties().stacksTo(1)
        )
    }
    val RED_SANDSTONE_INFUSION_STONE: DeferredItem<Item> = registerItem("red_sandstone_infusion_stone") {
        InfusionStoneItem(
            InfusionStoneType.RED_SANDSTONE,
            Item.Properties().stacksTo(1)
        )
    }
    val ALCHEMICAL_INFUSION_STONE: DeferredItem<Item> = registerItem("alchemical_infusion_stone") {
        InfusionStoneItem(
            InfusionStoneType.ALCHEMICAL,
            Item.Properties().stacksTo(1)
        )
    }

    val STONE_ROCK_GRINDER: DeferredItem<Item> = registerItem("stone_rock_grinder") {
        RockGrinderItem(
            RockGrinderType.STONE,
            Item.Properties().stacksTo(1)
        )
    }
    val IRON_ROCK_GRINDER: DeferredItem<Item> = registerItem("iron_rock_grinder") {
        RockGrinderItem(
            RockGrinderType.IRON,
            Item.Properties().stacksTo(1)
        )
    }
    val DIAMOND_ROCK_GRINDER: DeferredItem<Item> = registerItem("diamond_rock_grinder") {
        RockGrinderItem(
            RockGrinderType.DIAMOND,
            Item.Properties().stacksTo(1)
        )
    }

    val CACTUS_CUTTING_KNIFE: DeferredItem<Item> = registerItem("cactus_cutting_knife") {
        CuttingKnifeItem(
            CuttingKnifeType.CACTUS,
            Item.Properties().stacksTo(1)
        )
    }
    val STONE_CUTTING_KNIFE: DeferredItem<Item> = registerItem("stone_cutting_knife") {
        CuttingKnifeItem(
            CuttingKnifeType.STONE,
            Item.Properties().stacksTo(1)
        )
    }
    val IRON_CUTTING_KNIFE: DeferredItem<Item> = registerItem("iron_cutting_knife") {
        CuttingKnifeItem(
            CuttingKnifeType.IRON,
            Item.Properties().stacksTo(1)
        )
    }
    val DIAMOND_CUTTING_KNIFE: DeferredItem<Item> = registerItem("diamond_cutting_knife") {
        CuttingKnifeItem(
            CuttingKnifeType.DIAMOND,
            Item.Properties().stacksTo(1)
        )
    }

    // ----- Food Items -----

    val CACTUS_FRUIT: DeferredItem<Item> = registerItem("cactus_fruit") {
        Item(Item.Properties().food(ModFoods.CACTUS_FRUIT))
    }
    val FLESHY_SNOW_NUGGET: DeferredItem<Item> = registerItem("fleshy_snow_nugget") {
        Item(Item.Properties().food(ModFoods.FLESHY_SNOW_NUGGET))
    }

    // ----- Liquid Bucket Items -----

    val CRYSTAL_FLUID_BUCKET: DeferredItem<Item> = registerItem("crystal_fluid_bucket") {
        BucketItem(
            ModFluids.CRYSTAL_FLUID.get(),
            Item.Properties()
                .craftRemainder(Items.BUCKET)
                .stacksTo(1)
        )
    }
    val DIRTY_CRYSTAL_FLUID_BUCKET: DeferredItem<Item> = registerItem("dirty_crystal_fluid_bucket") {
        BucketItem(
            ModFluids.DIRTY_CRYSTAL_FLUID.get(),
            Item.Properties()
                .craftRemainder(Items.BUCKET)
                .stacksTo(1)
        )
    }

    // ----- Ingot Items -----

    val TIN_INGOT: DeferredItem<Item> = registerItem("tin_ingot") {
        IngotItem(OreType.TIN, Item.Properties())
    }
    val SILVER_INGOT: DeferredItem<Item> = registerItem("silver_ingot") {
        IngotItem(OreType.SILVER, Item.Properties())
    }
    val ZINC_INGOT: DeferredItem<Item> = registerItem("zinc_ingot") {
        IngotItem(OreType.ZINC, Item.Properties())
    }
    val NICKEL_INGOT: DeferredItem<Item> = registerItem("nickel_ingot") {
        IngotItem(OreType.NICKEL, Item.Properties())
    }
    val PLATINUM_INGOT: DeferredItem<Item> = registerItem("platinum_ingot") {
        IngotItem(OreType.PLATINUM, Item.Properties())
    }
    val ALUMINUM_INGOT: DeferredItem<Item> = registerItem("aluminum_ingot") {
        IngotItem(OreType.ALUMINUM, Item.Properties())
    }
    val LEAD_INGOT: DeferredItem<Item> = registerItem("lead_ingot") {
        IngotItem(OreType.LEAD, Item.Properties())
    }
    val COBALT_INGOT: DeferredItem<Item> = registerItem("cobalt_ingot") {
        IngotItem(OreType.COBALT, Item.Properties())
    }
    val ARDITE_INGOT: DeferredItem<Item> = registerItem("ardite_ingot") {
        IngotItem(OreType.ARDITE, Item.Properties())
    }
    val OSMIUM_INGOT: DeferredItem<Item> = registerItem("osmium_ingot") {
        IngotItem(OreType.OSMIUM, Item.Properties())
    }
    val DRACONIUM_INGOT: DeferredItem<Item> = registerItem("draconium_ingot") {
        IngotItem(OreType.DRACONIUM, Item.Properties())
    }
    val TITANIUM_INGOT: DeferredItem<Item> = registerItem("titanium_ingot") {
        IngotItem(OreType.TITANIUM, Item.Properties())
    }
    val TUNGSTEN_INGOT: DeferredItem<Item> = registerItem("tungsten_ingot") {
        IngotItem(OreType.TUNGSTEN, Item.Properties())
    }
    val CHROME_INGOT: DeferredItem<Item> = registerItem("chrome_ingot") {
        IngotItem(OreType.CHROME, Item.Properties())
    }
    val IRIDIUM_INGOT: DeferredItem<Item> = registerItem("iridium_ingot") {
        IngotItem(OreType.IRIDIUM, Item.Properties())
    }
    val BORON_INGOT: DeferredItem<Item> = registerItem("boron_ingot") {
        IngotItem(OreType.BORON, Item.Properties())
    }
    val LITHIUM_INGOT: DeferredItem<Item> = registerItem("lithium_ingot") {
        IngotItem(OreType.LITHIUM, Item.Properties())
    }
    val MAGNESIUM_INGOT: DeferredItem<Item> = registerItem("magnesium_ingot") {
        IngotItem(OreType.MAGNESIUM, Item.Properties())
    }
    val MITHRIL_INGOT: DeferredItem<Item> = registerItem("mithril_ingot") {
        IngotItem(OreType.MITHRIL, Item.Properties())
    }
    val YELLORIUM_INGOT: DeferredItem<Item> = registerItem("yellorium_ingot") {
        IngotItem(OreType.YELLORIUM, Item.Properties())
    }
    val URANIUM_INGOT: DeferredItem<Item> = registerItem("uranium_ingot") {
        IngotItem(OreType.URANIUM, Item.Properties())
    }
    val THORIUM_INGOT: DeferredItem<Item> = registerItem("thorium_ingot") {
        IngotItem(OreType.THORIUM, Item.Properties())
    }

    private fun <T : Item> registerItem(name: String, item: () -> T) = ITEMS.register(name) { -> item() }

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}