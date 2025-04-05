package top.srcres258.skyresources.datagen

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.properties.DirectionProperty
import net.neoforged.neoforge.client.model.generators.BlockModelProvider
import net.neoforged.neoforge.client.model.generators.BlockStateProvider
import net.neoforged.neoforge.client.model.generators.ConfiguredModel
import net.neoforged.neoforge.client.model.generators.ModelFile
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.registries.DeferredBlock
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.block.ModBlocks
import top.srcres258.skyresources.block.custom.*

private const val DEFAULT_ANGLE_OFFSET = 180

class ModBlockStateProvider(
    output: PackOutput,
    exFileHelper: ExistingFileHelper
) : BlockStateProvider(output, SkyResources.MOD_ID, exFileHelper) {
    override fun registerStatesAndModels() {
        blockWithItem(ModBlocks.MAGMAFIED_STONE.get())
        blockWithItem(ModBlocks.SANDY_NETHERRACK.get())
        blockWithItem(ModBlocks.ALCHEMICAL_GLASS.get())
        blockWithItem(ModBlocks.BLAZE_POWDER_BLOCK.get())
        blockWithItem(ModBlocks.PETRIFIED_WOOD.get())
        blockWithItem(ModBlocks.PRTIFIED_PLANKS.get())
        blockWithItem(ModBlocks.HARDENED_COAL_BLOCK.get())
        blockWithItem(ModBlocks.DEHYDRATED_CACTUS.get(),
            models().getExistingFile(modLoc("block/dehydrated_cactus")))
        blockWithItem(ModBlocks.ALCHEMICAL_COAL_BLOCK.get())
        blockWithItem(ModBlocks.HEAVY_SNOW_BLOCK.get())

        blockWithItem(ModBlocks.WOODEN_CASING.get(), casing(ModBlocks.WOODEN_CASING.get()))
        blockWithItem(ModBlocks.STONE_CASING.get(), casing(ModBlocks.STONE_CASING.get()))
        blockWithItem(ModBlocks.BRONZE_CASING.get(), casing(ModBlocks.BRONZE_CASING.get()))
        blockWithItem(ModBlocks.IRON_CASING.get(), casing(ModBlocks.IRON_CASING.get()))
        blockWithItem(ModBlocks.STEEL_CASING.get(), casing(ModBlocks.STEEL_CASING.get()))
        blockWithItem(ModBlocks.ELECTRUM_CASING.get(), casing(ModBlocks.ELECTRUM_CASING.get()))
        blockWithItem(ModBlocks.NETHER_BRICK_CASING.get(), casing(ModBlocks.NETHER_BRICK_CASING.get()))
        blockWithItem(ModBlocks.LEAD_CASING.get(), casing(ModBlocks.LEAD_CASING.get()))
        blockWithItem(ModBlocks.MANYULLYN_CASING.get(), casing(ModBlocks.MANYULLYN_CASING.get()))
        blockWithItem(ModBlocks.SIGNALUM_CASING.get(), casing(ModBlocks.SIGNALUM_CASING.get()))
        blockWithItem(ModBlocks.END_STONE_CASING.get(), casing(ModBlocks.END_STONE_CASING.get()))
        blockWithItem(ModBlocks.ENDERIUM_CASING.get(), casing(ModBlocks.ENDERIUM_CASING.get()))
        blockWithItem(ModBlocks.DARK_MATTER_CASING.get(), casing(ModBlocks.DARK_MATTER_CASING.get()))
        blockWithItem(ModBlocks.LIGHT_MATTER_CASING.get(), casing(ModBlocks.LIGHT_MATTER_CASING.get()))
        blockWithItem(ModBlocks.OSMIUM_CASING.get(), casing(ModBlocks.OSMIUM_CASING.get()))
        blockWithItem(ModBlocks.REFINED_OBSIDIAN_CASING.get(), casing(ModBlocks.REFINED_OBSIDIAN_CASING.get()))

        blockWithItem(ModBlocks.DARK_MATTER_BLOCK.get())
        blockWithItem(ModBlocks.LIGHT_MATTER_BLOCK.get())
        blockWithItem(ModBlocks.SILVERFISH_TELEPORTATION_DISRUPTOR.get(),
            models().getExistingFile(modLoc("block/silverfish_teleportation_disruptor")))
        blockWithItem(ModBlocks.LIFE_INFUSER_CORE.get(),
            models().getExistingFile(modLoc("block/life_infuser_core")))
        blockWithItem(
            ModBlocks.END_PORTAL_CORE.get(),
            models().cubeBottomTop(
                ModBlocks.END_PORTAL_CORE.id.path,
                modLoc("block/end_portal_core_side"),
                modLoc("block/end_portal_core_bottom"),
                modLoc("block/end_portal_core_top")
            )
        )
        blockWithItem(ModBlocks.COMBUSTION_COLLECTOR.get())
        machineBlockWithItem(ModBlocks.SMART_COMBUSTION_CONTROLLER, SmartCombustionControllerBlock.FACING)

        horizontalFacingBlockWithItem(
            ModBlocks.DIRT_FURNACE.get(),
            DirtFurnaceBlock.FACING,
            { modLoc("block/dirt_furnace") },
            { mcLoc("block/dirt") },
            { state ->
                if (state.getValue(DirtFurnaceBlock.LIT)) {
                    "dirt_furnace_on"
                } else {
                    "dirt_furnace"
                }
            }
        )
        blockWithItem(ModBlocks.CRUCIBLE.get(), models().getExistingFile(modLoc("block/crucible")))
        blockWithItem(ModBlocks.FLUID_DROPPER.get(), models().cube(
            ModBlocks.FLUID_DROPPER.id.path,
            mcLoc("block/dropper_front_vertical"),
            mcLoc("block/furnace_top"),
            mcLoc("block/furnace_side"),
            mcLoc("block/furnace_side"),
            mcLoc("block/furnace_side"),
            mcLoc("block/furnace_side")
        ).texture("particle", mcLoc("block/furnace_side")))
        blockWithItem(ModBlocks.QUICK_DROPPER.get(), models().cube(
            ModBlocks.QUICK_DROPPER.id.path,
            modLoc("block/quick_dropper_bottom"),
            modLoc("block/machine"),
            modLoc("block/machine"),
            modLoc("block/machine"),
            modLoc("block/machine"),
            modLoc("block/machine")
        ).texture("particle", modLoc("block/machine")))
        blockWithItem(ModBlocks.CRUCIBLE_INSERTER.get(),
            models().getExistingFile(modLoc("block/crucible_inserter")))
        blockWithItem(ModBlocks.LIFE_INJECTOR.get(),
            models().getExistingFile(modLoc("block/life_injector")))

        machineBlockWithItem(ModBlocks.ROCK_CRUSHER, RockCrusherBlock.FACING)
        machineBlockWithItem(ModBlocks.ROCK_CLEANER, RockCleanerBlock.FACING)
        machineBlockWithItem(ModBlocks.AQUEOUS_CONCENTRATOR, AqueousConcentratorBlock.FACING)
        machineBlockWithItem(ModBlocks.AQUEOUS_DECONCENTRATOR, AqueousDeconcentratorBlock.FACING)
        blockWithItem(ModBlocks.WILDLIFE_ATTRACTOR.get(), models().cube(
            ModBlocks.WILDLIFE_ATTRACTOR.id.path,
            modLoc("block/wildlife_attractor_top"),
            modLoc("block/wildlife_attractor_top"),
            modLoc("block/wildlife_attractor_side"),
            modLoc("block/wildlife_attractor_side"),
            modLoc("block/wildlife_attractor_side"),
            modLoc("block/wildlife_attractor_side")
        ).texture("particle", modLoc("block/wildlife_attractor_side")))
        blockWithItem(ModBlocks.DARK_MATTER_TRANSFORMER.get())

        blockWithItem(ModBlocks.ALCHEMICAL_FUSION_TABLE.get(), models().cube(
            ModBlocks.ALCHEMICAL_FUSION_TABLE.id.path,
            modLoc("block/alchemical_fusion_table_bottom"),
            modLoc("block/alchemical_fusion_table_top"),
            modLoc("block/alchemical_fusion_table_side"),
            modLoc("block/alchemical_fusion_table_side"),
            modLoc("block/alchemical_fusion_table_side"),
            modLoc("block/alchemical_fusion_table_side")
        ).texture("particle", modLoc("block/alchemical_fusion_table_side")))
        blockWithItem(ModBlocks.MINI_FREEZER.get(),
            models().getExistingFile(modLoc("block/mini_freezer")))
        blockWithItem(ModBlocks.IRON_FREEZER.get(),
            models().getExistingFile(modLoc("block/iron_freezer_bottom")))
        blockWithItem(ModBlocks.LIGHT_MATTER_FREEZER.get(),
            models().getExistingFile(modLoc("block/light_matter_freezer_bottom")))

        fluid(ModBlocks.CRYSTAL_FLUID)
        fluid(ModBlocks.DIRTY_CRYSTAL_FLUID)
    }

    private fun blockWithItem(block: Block, model: ModelFile = cubeAll(block)) {
        simpleBlockWithItem(block, model)
    }

    private fun casing(name: String, texture: ResourceLocation) =
        models().singleTexture(name, modLoc("block/casing"), "all", texture)

    private fun casing(block: Block) = casing(BuiltInRegistries.BLOCK.getKey(block).path, blockTexture(block))

    private fun horizontalFacingBlockWithItem(
        block: Block,
        directionProperty: DirectionProperty,
        facingTextureIdFunc: (BlockState) -> ResourceLocation,
        otherTextureIdFunc: (BlockState) -> ResourceLocation,
        modelFileNameFunc: ((BlockState) -> String)? = null
    ) {
        val blockPath = BuiltInRegistries.BLOCK.getKey(block).path

        val modelFileNameFunc1 = if (modelFileNameFunc == null) {
            { blockPath }
        } else {
            modelFileNameFunc
        }
        getVariantBuilder(block)
            .forAllStates { state ->
                state.getValue(directionProperty)
                    .let { direction ->
                        ConfiguredModel.builder()
                            .modelFile(generateHorizontalFacingBlockModelFile(
                                models(),
                                modelFileNameFunc1(state),
                                facingTextureIdFunc(state),
                                otherTextureIdFunc(state)
                            ))
                            .rotationY((direction.toYRot().toInt() + DEFAULT_ANGLE_OFFSET) % 360)
                            .build()
                    }
            }

        val defaultBlockState = block.defaultBlockState()
        val defaultModelFile = generateHorizontalFacingBlockModelFile(
            models(),
            modelFileNameFunc1(defaultBlockState),
            facingTextureIdFunc(defaultBlockState),
            otherTextureIdFunc(defaultBlockState)
        )
        simpleBlockItem(block, defaultModelFile)
    }

    private fun machineBlockWithItem(block: DeferredBlock<out Block>, directionProperty: DirectionProperty) {
        horizontalFacingBlockWithItem(
            block.get(),
            directionProperty,
            { modLoc("block/${block.id.path}") },
            { modLoc("block/machine") }
        )
    }

    private fun fluid(block: DeferredBlock<out Block>) {
        models().getBuilder(block.id.toString())
            .texture("particle", mcLoc("block/water_still"))
    }
}

private fun generateHorizontalFacingBlockModelFile(
    modelProvider: BlockModelProvider,
    name: String,
    facingTextureId: ResourceLocation,
    otherTextureId: ResourceLocation
) = modelProvider.orientable(name, otherTextureId, facingTextureId, otherTextureId)
    .texture("particle", otherTextureId)