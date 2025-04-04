package top.srcres258.skyresources.datagen

import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.neoforged.neoforge.client.model.generators.ItemModelProvider
import net.neoforged.neoforge.client.model.generators.ModelFile
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.registries.DeferredItem
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.item.ModItems

class ModItemModelProvider(
    output: PackOutput,
    existingFileHelper: ExistingFileHelper
) : ItemModelProvider(output, SkyResources.MOD_ID, existingFileHelper) {
    override fun registerModels() {
        basicItem(ModItems.PLANT_MATTER.get())
        basicItem(ModItems.ENRICHED_BONE_MEAL.get())
        basicItem(ModItems.HEAVY_SNOWBALL.get())
        basicItem(ModItems.EXPLOSIVE_HEAVY_SNOWBALL.get())

        basicItem(ModItems.WOODEN_HEAT_COMPONENT.get())
        basicItem(ModItems.STONE_HEAT_COMPONENT.get())
        basicItem(ModItems.BRONZE_HEAT_COMPONENT.get())
        basicItem(ModItems.IRON_HEAT_COMPONENT.get())
        basicItem(ModItems.STEEL_HEAT_COMPONENT.get())
        basicItem(ModItems.ELECTRUM_HEAT_COMPONENT.get())
        basicItem(ModItems.NETHER_BRICK_HEAT_COMPONENT.get())
        basicItem(ModItems.LEAD_HEAT_COMPONENT.get())
        basicItem(ModItems.MANYULLYN_HEAT_COMPONENT.get())
        basicItem(ModItems.SIGNALUM_HEAT_COMPONENT.get())
        basicItem(ModItems.END_STONE_HEAT_COMPONENT.get())
        basicItem(ModItems.ENDERIUM_HEAT_COMPONENT.get())
        basicItem(ModItems.DARK_MATTER_HEAT_COMPONENT.get())
        basicItem(ModItems.LIGHT_MATTER_HEAT_COMPONENT.get())
        basicItem(ModItems.OSMIUM_HEAT_COMPONENT.get())
        basicItem(ModItems.REFINED_OBSIDIAN_HEAT_COMPONENT.get())

        basicItem(ModItems.WOODEN_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.STONE_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.BRONZE_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.IRON_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.STEEL_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.ELECTRUM_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.NETHER_BRICK_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.LEAD_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.MANYULLYN_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.SIGNALUM_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.END_STONE_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.ENDERIUM_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.DARK_MATTER_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.LIGHT_MATTER_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.OSMIUM_ALCHEMY_COMPONENT.get())
        basicItem(ModItems.REFINED_OBSIDIAN_ALCHEMY_COMPONENT.get())

        basicItem(ModItems.QUARTZ_AMPLIFICATION_COMPONENT.get())
        basicItem(ModItems.ADVANCED_POWER_COMPONENT.get())
        basicItem(ModItems.FROZEN_IRON_COOLING_COMPONENT.get())
        basicItem(ModItems.FROZEN_IRON_INGOT.get())

        basicItem(ModItems.DIRTY_EMERALD.get())
        basicItem(ModItems.DIRTY_DIAMOND.get())
        basicItem(ModItems.DIRTY_RUBY.get())
        basicItem(ModItems.DIRTY_SAPPHIRE.get())
        basicItem(ModItems.DIRTY_PERIDOT.get())
        basicItem(ModItems.DIRTY_RED_GARNET.get())
        basicItem(ModItems.DIRTY_YELLOW_GARNET.get())
        basicItem(ModItems.DIRTY_APATITE.get())
        basicItem(ModItems.DIRTY_AMBER.get())
        basicItem(ModItems.DIRTY_LEPIDOLITE.get())
        basicItem(ModItems.DIRTY_MALACHITE.get())
        basicItem(ModItems.DIRTY_ONYX.get())
        basicItem(ModItems.DIRTY_MOLDAVITE.get())
        basicItem(ModItems.DIRTY_AGATE.get())
        basicItem(ModItems.DIRTY_OPAL.get())
        basicItem(ModItems.DIRTY_MORGANITE.get())
        basicItem(ModItems.DIRTY_AMETHYST.get())
        basicItem(ModItems.DIRTY_CARNELIAN.get())
        basicItem(ModItems.DIRTY_JASPER.get())
        basicItem(ModItems.DIRTY_BERYL.get())
        basicItem(ModItems.DIRTY_AQUAMARINE.get())
        basicItem(ModItems.DIRTY_GOLDEN_BERYL.get())
        basicItem(ModItems.DIRTY_HELIODOR.get())
        basicItem(ModItems.DIRTY_CITRINE.get())
        basicItem(ModItems.DIRTY_TURQUOISE.get())
        basicItem(ModItems.DIRTY_INDICOLITE.get())
        basicItem(ModItems.DIRTY_MOONSTONE.get())
        basicItem(ModItems.DIRTY_GARNET.get())
        basicItem(ModItems.DIRTY_TOPAZ.get())
        basicItem(ModItems.DIRTY_AMETRINE.get())
        basicItem(ModItems.DIRTY_TANZANITE.get())
        basicItem(ModItems.DIRTY_VIOLET_SAPPHIRE.get())
        basicItem(ModItems.DIRTY_ALEXANDRITE.get())
        basicItem(ModItems.DIRTY_BLUE_TOPAZ.get())
        basicItem(ModItems.DIRTY_SPINEL.get())
        basicItem(ModItems.DIRTY_IOLITE.get())
        basicItem(ModItems.DIRTY_BLACK_DIAMOND.get())
        basicItem(ModItems.DIRTY_CHAOS.get())
        basicItem(ModItems.DIRTY_ENDER_ESSENCE.get())
        basicItem(ModItems.DIRTY_DARK_GEM.get())
        basicItem(ModItems.DIRTY_QUARTZ.get())
        basicItem(ModItems.DIRTY_LAPIS_LAZULI.get())
        basicItem(ModItems.DIRTY_BLACK_QUARTZ.get())
        basicItem(ModItems.DIRTY_CERTUS_QUARTZ.get())

        basicItem(ModItems.CACTUS_NEEDLE.get())
        basicItem(ModItems.CACTUS_FRUIT_ON_A_NEEDLE.get())
        basicItem(ModItems.ALCHEMICAL_GOLD_NEEDLE.get())
        basicItem(ModItems.SAWDUST.get())
        basicItem(ModItems.CRUSHED_STONE.get())
        basicItem(ModItems.CRUSHED_NETHERRACK.get())

        basicItem(ModItems.RADIOACTIVE_POWDER_MIXTURE.get())

        basicItem(ModItems.IRON_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.GOLD_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.COPPER_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.TIN_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.SILVER_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.ZINC_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.NICKEL_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.PLATINUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.ALUMINUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.LEAD_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.COBALT_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.ARDITE_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.OSMIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.DRACONIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.TITANIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.TUNGSTEN_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.CHROME_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.IRIDIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.BORON_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.LITHIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.MAGNESIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.MITHRIL_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.YELLORIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.URANIUM_ALCHEMICAL_ORE_DUST.get())
        basicItem(ModItems.THORIUM_ALCHEMICAL_ORE_DUST.get())

        basicItem(ModItems.PRIMUS_ALCHEMICAL_DUST.get())
        basicItem(ModItems.SECUNDUS_ALCHEMICAL_DUST.get())
        basicItem(ModItems.TERTIUS_ALCHEMICAL_DUST.get())
        basicItem(ModItems.QUARTUS_ALCHEMICAL_DUST.get())

        basicItem(ModItems.ALCHEMICAL_COAL.get())
        basicItem(ModItems.ALCHEMICAL_GOLD_INGOT.get())
        basicItem(ModItems.ALCHEMICAL_IRON_INGOT.get())
        basicItem(ModItems.ALCHEMICAL_DIAMOND.get())
        basicItem(ModItems.DARK_MATTER.get())
        basicItem(ModItems.LIGHT_MATTER.get())
        basicItem(ModItems.CRYSTAL_SHARD.get())

        machinePartTopItem(
            ModItems.WOODEN_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            mcLoc("block/oak_log")
        )
        machinePartTopItem(
            ModItems.STONE_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            mcLoc("block/stone")
        )
        machinePartTopItem(
            ModItems.BRONZE_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/bronze_machine")
        )
        machinePartTopItem(
            ModItems.IRON_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/machine")
        )
        machinePartTopItem(
            ModItems.STEEL_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/steel_machine")
        )
        machinePartTopItem(
            ModItems.ELECTRUM_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/electrum_machine")
        )
        machinePartTopItem(
            ModItems.NETHER_BRICK_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            mcLoc("block/nether_bricks")
        )
        machinePartTopItem(
            ModItems.LEAD_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/lead_machine")
        )
        machinePartTopItem(
            ModItems.MANYULLYN_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/manyullyn_machine")
        )
        machinePartTopItem(
            ModItems.SIGNALUM_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/signalum_machine")
        )
        machinePartTopItem(
            ModItems.END_STONE_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            mcLoc("block/end_stone")
        )
        machinePartTopItem(
            ModItems.ENDERIUM_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/enderium_machine")
        )
        machinePartTopItem(
            ModItems.DARK_MATTER_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/dark_matter_block")
        )
        machinePartTopItem(
            ModItems.LIGHT_MATTER_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/light_matter_block")
        )
        machinePartTopItem(
            ModItems.OSMIUM_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/osmium_machine")
        )
        machinePartTopItem(
            ModItems.REFINED_OBSIDIAN_HEAT_PROVIDER,
            modLoc("block/heat_provider"),
            modLoc("block/refined_obsidian_machine")
        )

        machinePartTopItem(
            ModItems.WOODEN_CONDENSER,
            modLoc("block/condenser"),
            mcLoc("block/oak_log")
        )
        machinePartTopItem(
            ModItems.STONE_CONDENSER,
            modLoc("block/condenser"),
            mcLoc("block/stone")
        )
        machinePartTopItem(
            ModItems.BRONZE_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/bronze_machine")
        )
        machinePartTopItem(
            ModItems.IRON_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/machine")
        )
        machinePartTopItem(
            ModItems.STEEL_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/steel_machine")
        )
        machinePartTopItem(
            ModItems.ELECTRUM_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/electrum_machine")
        )
        machinePartTopItem(
            ModItems.NETHER_BRICK_CONDENSER,
            modLoc("block/condenser"),
            mcLoc("block/nether_bricks")
        )
        machinePartTopItem(
            ModItems.LEAD_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/lead_machine")
        )
        machinePartTopItem(
            ModItems.MANYULLYN_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/manyullyn_machine")
        )
        machinePartTopItem(
            ModItems.SIGNALUM_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/signalum_machine")
        )
        machinePartTopItem(
            ModItems.END_STONE_CONDENSER,
            modLoc("block/condenser"),
            mcLoc("block/end_stone")
        )
        machinePartTopItem(
            ModItems.ENDERIUM_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/enderium_machine")
        )
        machinePartTopItem(
            ModItems.DARK_MATTER_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/dark_matter_block")
        )
        machinePartTopItem(
            ModItems.LIGHT_MATTER_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/light_matter_block")
        )
        machinePartTopItem(
            ModItems.OSMIUM_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/osmium_machine")
        )
        machinePartTopItem(
            ModItems.REFINED_OBSIDIAN_CONDENSER,
            modLoc("block/condenser"),
            modLoc("block/refined_obsidian_machine")
        )

        machinePartTopItem(
            ModItems.WOODEN_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            mcLoc("block/oak_log")
        )
        machinePartTopItem(
            ModItems.STONE_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            mcLoc("block/stone")
        )
        machinePartTopItem(
            ModItems.BRONZE_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/bronze_machine")
        )
        machinePartTopItem(
            ModItems.IRON_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/machine")
        )
        machinePartTopItem(
            ModItems.STEEL_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/steel_machine")
        )
        machinePartTopItem(
            ModItems.ELECTRUM_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/electrum_machine")
        )
        machinePartTopItem(
            ModItems.NETHER_BRICK_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            mcLoc("block/nether_bricks")
        )
        machinePartTopItem(
            ModItems.LEAD_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/lead_machine")
        )
        machinePartTopItem(
            ModItems.MANYULLYN_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/manyullyn_machine")
        )
        machinePartTopItem(
            ModItems.SIGNALUM_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/signalum_machine")
        )
        machinePartTopItem(
            ModItems.END_STONE_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            mcLoc("block/end_stone")
        )
        machinePartTopItem(
            ModItems.ENDERIUM_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/enderium_machine")
        )
        machinePartTopItem(
            ModItems.DARK_MATTER_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/dark_matter_block")
        )
        machinePartTopItem(
            ModItems.LIGHT_MATTER_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/light_matter_block")
        )
        machinePartTopItem(
            ModItems.OSMIUM_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/osmium_machine")
        )
        machinePartTopItem(
            ModItems.REFINED_OBSIDIAN_COMBUSTION_HEATER,
            modLoc("block/combustion_heater"),
            modLoc("block/refined_obsidian_machine")
        )

        basicItem(ModItems.WATER_EXTRACTOR.get())
        basicItem(ModItems.HEALTH_GEM.get())
        basicItem(ModItems.SURVIVALIST_FISHING_ROD.get())

        basicItem(ModItems.SANDSTONE_INFUSION_STONE.get())
        basicItem(ModItems.RED_SANDSTONE_INFUSION_STONE.get())
        basicItem(ModItems.ALCHEMICAL_INFUSION_STONE.get())

        basicItem(ModItems.STONE_ROCK_GRINDER.get())
        basicItem(ModItems.IRON_ROCK_GRINDER.get())
        basicItem(ModItems.DIAMOND_ROCK_GRINDER.get())

        basicItem(ModItems.CACTUS_CUTTING_KNIFE.get())
        basicItem(ModItems.STONE_CUTTING_KNIFE.get())
        basicItem(ModItems.IRON_CUTTING_KNIFE.get())
        basicItem(ModItems.DIAMOND_CUTTING_KNIFE.get())
    }

    private fun machinePartTopItem(
        item: DeferredItem<out Item>,
        partTextureId: ResourceLocation? = null,
        allTextureId: ResourceLocation? = null
    ) =
        getBuilder(item.id.toString())
            .parent(ModelFile.ExistingModelFile(modLoc("block/machine_part_top"), existingFileHelper))
            .also { builder ->
                if (partTextureId != null) {
                    builder.texture("part", partTextureId)
                }
            }
            .also { builder ->
                if (allTextureId != null) {
                    builder.texture("all", allTextureId)
                }
            }
}