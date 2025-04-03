package top.srcres258.renewal.skyresources.datagen

import net.minecraft.core.Direction
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.properties.DirectionProperty
import net.neoforged.neoforge.client.model.generators.BlockModelProvider
import net.neoforged.neoforge.client.model.generators.BlockStateProvider
import net.neoforged.neoforge.client.model.generators.ConfiguredModel
import net.neoforged.neoforge.client.model.generators.ModelFile
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.registries.DeferredBlock
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.block.ModBlocks
import top.srcres258.renewal.skyresources.block.custom.SmartCombustionControllerBlock

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
        blockWithItem(ModBlocks.DEHYDRATED_CACTUS.get(), models().getExistingFile(modLoc("block/dehydrated_cactus")))
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
    }

    private fun blockWithItem(block: Block, model: ModelFile = cubeAll(block)) {
        simpleBlockWithItem(block, model)
    }

    private fun casing(name: String, texture: ResourceLocation) =
        models().singleTexture(name, modLoc("block/casing"), "all", texture)

    private fun casing(block: Block) = casing(BuiltInRegistries.BLOCK.getKey(block).path, blockTexture(block))

    private fun horizontalFacingBlockWithItem(
        block: Block,
        prefix: String,
        directionProperty: DirectionProperty,
        facingTextureId: ResourceLocation,
        otherTextureId: ResourceLocation
    ) {
        fun nameFunc(direction: Direction) = "${prefix}_${direction.getName().lowercase()}"

        getVariantBuilder(block)
            .forAllStates { state ->
                state.getValue(directionProperty)
                    .let { direction ->
                        generateHorizontalFacingBlockModelFile(
                            models(),
                            nameFunc(direction),
                            direction,
                            facingTextureId,
                            otherTextureId
                        )?.let { model -> arrayOf(ConfiguredModel(model)) } ?: arrayOf()
                    }
            }

        val itemDirection = Direction.NORTH
        simpleBlockItem(block, generateHorizontalFacingBlockModelFile(models(), nameFunc(itemDirection),
            itemDirection, facingTextureId, otherTextureId)!!)
    }

    private fun horizontalFacingBlockWithItem(
        block: DeferredBlock<out Block>,
        directionProperty: DirectionProperty,
        facingTextureId: ResourceLocation,
        otherTextureId: ResourceLocation
    ) {
        horizontalFacingBlockWithItem(block.get(), block.id.path, directionProperty, facingTextureId, otherTextureId)
    }

    private fun machineBlockWithItem(block: DeferredBlock<out Block>, directionProperty: DirectionProperty) {
        horizontalFacingBlockWithItem(
            block,
            directionProperty,
            modLoc("block/${block.id.path}"),
            modLoc("block/machine")
        )
    }
}

private fun generateHorizontalFacingBlockModelFile(
    modelProvider: BlockModelProvider,
    name: String,
    direction: Direction,
    facingTextureId: ResourceLocation,
    otherTextureId: ResourceLocation
): ModelFile? = when (direction) {
    Direction.NORTH -> modelProvider.cube(
        name, otherTextureId, otherTextureId,
        facingTextureId, otherTextureId, otherTextureId, otherTextureId
    )
    Direction.SOUTH -> modelProvider.cube(
        name, otherTextureId, otherTextureId,
        otherTextureId, facingTextureId, otherTextureId, otherTextureId
    )
    Direction.EAST -> modelProvider.cube(
        name, otherTextureId, otherTextureId,
        otherTextureId, otherTextureId, facingTextureId, otherTextureId
    )
    Direction.WEST -> modelProvider.cube(
        name, otherTextureId, otherTextureId,
        otherTextureId, otherTextureId, otherTextureId, facingTextureId
    )
    else -> null
}?.texture("particle", otherTextureId)