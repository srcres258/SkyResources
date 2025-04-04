package top.srcres258.renewal.skyresources.block

import net.minecraft.util.ColorRGBA
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.block.custom.*
import top.srcres258.renewal.skyresources.item.ModItems
import top.srcres258.renewal.skyresources.util.MaterialType

private val MACHINE_BLOCK_PROPERTIES = BlockBehaviour.Properties.of()
    .mapColor(MapColor.STONE)
    .requiresCorrectToolForDrops()
    .strength(3.0F, 4.8F)
    .sound(SoundType.METAL)

object ModBlocks {
    val BLOCKS: DeferredRegister.Blocks = DeferredRegister.createBlocks(SkyResources.MOD_ID)

    // ----- Basic Blocks -----

    val MAGMAFIED_STONE: DeferredBlock<Block> = registerBlockWithItem("magmafied_stone") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK))
    }
    val SANDY_NETHERRACK: DeferredBlock<Block> = registerBlockWithItem("sandy_netherrack") {
        ColoredFallingBlock(
            ColorRGBA(0xDBD3A0),
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.SAND)
                .instrument(NoteBlockInstrument.SNARE)
                .strength(0.5F)
                .sound(SoundType.SAND)
        )
    }
    val ALCHEMICAL_GLASS: DeferredBlock<Block> = registerBlockWithItem("alchemical_glass") {
        TransparentBlock(
            BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.HAT)
                .strength(0.3F)
                .sound(SoundType.GLASS)
                .noOcclusion()
                .isValidSpawn { _, _, _, _ -> false }
                .isRedstoneConductor { _, _, _ -> false }
                .isSuffocating { _, _, _ -> false }
                .isViewBlocking { _, _, _ -> false }
        )
    }
    val BLAZE_POWDER_BLOCK: DeferredBlock<Block> = registerBlockWithItem("blaze_powder_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.FIRE)
                .strength(0.5F)
                .sound(SoundType.METAL)
        )
    }
    val PETRIFIED_WOOD: DeferredBlock<Block> = registerBlockWithItem("petrified_wood") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(SoundType.WOOD)
        )
    }
    val PRTIFIED_PLANKS: DeferredBlock<Block> = registerBlockWithItem("petrified_planks") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F, 3.0F)
                .sound(SoundType.WOOD)
        )
    }
    val HARDENED_COAL_BLOCK: DeferredBlock<Block> = registerBlockWithItem("hardened_coal_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLACK)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
        )
    }
    val DEHYDRATED_CACTUS: DeferredBlock<Block> = registerBlockWithItem("dehydrated_cactus") {
        DehydratedCactusBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .strength(0.4F)
                .sound(SoundType.WOOL)
                .pushReaction(PushReaction.DESTROY) // Destroyed by pistons when pushed.
        )
    }
    val ALCHEMICAL_COAL_BLOCK: DeferredBlock<Block> = registerBlockWithItem("alchemical_coal_block") {
        Block(BlockBehaviour.Properties.ofFullCopy(HARDENED_COAL_BLOCK.get()))
    }
    val HEAVY_SNOW_BLOCK: DeferredBlock<Block> = registerBlockWithItem("heavy_snow_block") {
        Block(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.SNOW)
                .strength(0.2F)
                .sound(SoundType.SNOW)
        )
    }

    // ----- Multi-block Structure Component Blocks -----

    val WOODEN_CASING: DeferredBlock<Block> = registerBlockWithItem("wooden_casing") {
        CasingBlock(
            MaterialType.WOOD,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
        )
    }
    val STONE_CASING: DeferredBlock<Block> = registerBlockWithItem("stone_casing") {
        CasingBlock(
            MaterialType.STONE,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.STONE)
                .noOcclusion()
        )
    }
    val BRONZE_CASING: DeferredBlock<Block> = registerBlockWithItem("bronze_casing") {
        CasingBlock(
            MaterialType.BRONZE,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val IRON_CASING: DeferredBlock<Block> = registerBlockWithItem("iron_casing") {
        CasingBlock(
            MaterialType.IRON,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val STEEL_CASING: DeferredBlock<Block> = registerBlockWithItem("steel_casing") {
        CasingBlock(
            MaterialType.STEEL,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val ELECTRUM_CASING: DeferredBlock<Block> = registerBlockWithItem("electrum_casing") {
        CasingBlock(
            MaterialType.ELECTRUM,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val NETHER_BRICK_CASING: DeferredBlock<Block> = registerBlockWithItem("nether_brick_casing") {
        CasingBlock(
            MaterialType.NETHER_BRICK,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.NETHER_BRICKS)
                .noOcclusion()
        )
    }
    val LEAD_CASING: DeferredBlock<Block> = registerBlockWithItem("lead_casing") {
        CasingBlock(
            MaterialType.LEAD,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val MANYULLYN_CASING: DeferredBlock<Block> = registerBlockWithItem("manyullyn_casing") {
        CasingBlock(
            MaterialType.MANYULLYN,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val SIGNALUM_CASING: DeferredBlock<Block> = registerBlockWithItem("signalum_casing") {
        CasingBlock(
            MaterialType.SIGNALUM,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val END_STONE_CASING: DeferredBlock<Block> = registerBlockWithItem("end_stone_casing") {
        CasingBlock(
            MaterialType.END_STONE,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.STONE)
                .noOcclusion()
        )
    }
    val ENDERIUM_CASING: DeferredBlock<Block> = registerBlockWithItem("enderium_casing") {
        CasingBlock(
            MaterialType.ENDERIUM,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val DARK_MATTER_CASING: DeferredBlock<Block> = registerBlockWithItem("dark_matter_casing") {
        CasingBlock(
            MaterialType.DARK_MATTER,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val LIGHT_MATTER_CASING: DeferredBlock<Block> = registerBlockWithItem("light_matter_casing") {
        CasingBlock(
            MaterialType.LIGHT_MATTER,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val OSMIUM_CASING: DeferredBlock<Block> = registerBlockWithItem("osmium_casing") {
        CasingBlock(
            MaterialType.OSMIUM,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
        )
    }
    val REFINED_OBSIDIAN_CASING: DeferredBlock<Block> = registerBlockWithItem("refined_obsidian_casing") {
        CasingBlock(
            MaterialType.REFINED_OBSIDIAN,
            BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.STONE)
                .noOcclusion()
        )
    }

    val DARK_MATTER_BLOCK: DeferredBlock<Block> = registerBlockWithItem("dark_matter_block") {
        Block(BlockBehaviour.Properties.ofFullCopy(HARDENED_COAL_BLOCK.get()))
    }
    val LIGHT_MATTER_BLOCK: DeferredBlock<Block> = registerBlockWithItem("light_matter_block") {
        Block(BlockBehaviour.Properties.ofFullCopy(HEAVY_SNOW_BLOCK.get()))
    }
    val SILVERFISH_TELEPORTATION_DISRUPTOR: DeferredBlock<Block> = registerBlockWithItem("silverfish_teleportation_disruptor") {
        SilverfishTeleportationDisruptorBlock(
            BlockBehaviour.Properties.of()
                .strength(0.2F)
                .sound(SoundType.WOOD)
                .noOcclusion()
        )
    }
    val LIFE_INFUSER_CORE: DeferredBlock<Block> = registerBlockWithItem("life_infuser_core") {
        LifeInfuserCoreBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F, 3.0F)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
        )
    }
    val END_PORTAL_CORE: DeferredBlock<Block> = registerBlockWithItem("end_portal_core") {
        EndPortalCoreBlock(BlockBehaviour.Properties.ofFullCopy(DARK_MATTER_BLOCK.get()))
    }
    val COMBUSTION_COLLECTOR: DeferredBlock<Block> = registerBlockWithItem("combustion_collector") {
        CombustionCollectorBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val SMART_COMBUSTION_CONTROLLER: DeferredBlock<Block> = registerBlockWithItem("smart_combustion_controller") {
        SmartCombustionControllerBlock(MACHINE_BLOCK_PROPERTIES)
    }

    // ----- Basic Device Blocks -----

    val DIRT_FURNACE: DeferredBlock<Block> = registerBlockWithItem("dirt_furnace") {
        DirtFurnaceBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.DIRT)
                .strength(0.5F)
                .sound(SoundType.GRAVEL)
        )
    }
    val CRUCIBLE: DeferredBlock<Block> = registerBlockWithItem("crucible") {
        CrucibleBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_RED)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 6.0F)
                .noOcclusion()
        )
    }
    val FLUID_DROPPER: DeferredBlock<Block> = registerBlockWithItem("fluid_dropper") {
        FluidDropperBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(3.5F)
        )
    }
    val QUICK_DROPPER: DeferredBlock<Block> = registerBlockWithItem("quick_dropper") {
        QuickDropperBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val CRUCIBLE_INSERTER: DeferredBlock<Block> = registerBlockWithItem("crucible_inserter") {
        CrucibleInserterBlock(MACHINE_BLOCK_PROPERTIES.noOcclusion())
    }
    val LIFE_INJECTOR: DeferredBlock<Block> = registerBlockWithItem("life_injector") {
        LifeInjectorBlock(BlockBehaviour.Properties.ofFullCopy(LIFE_INFUSER_CORE.get()))
    }

    // Energy-consuming Device Blocks

    val ROCK_CRUSHER: DeferredBlock<Block> = registerBlockWithItem("rock_crusher") {
        RockCrusherBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val ROCK_CLEANER: DeferredBlock<Block> = registerBlockWithItem("rock_cleaner") {
        RockCleanerBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val AQUEOUS_CONCENTRATOR: DeferredBlock<Block> = registerBlockWithItem("aqueous_concentrator") {
        AqueousConcentratorBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val AQUEOUS_DECONCENTRATOR: DeferredBlock<Block> = registerBlockWithItem("aqueous_deconcentrator") {
        AqueousDeconcentratorBlock(MACHINE_BLOCK_PROPERTIES)
    }
    val WILDLIFE_ATTRACTOR: DeferredBlock<Block> = registerBlockWithItem("wildlife_attractor") {
        WildlifeAttractorBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .instrument(NoteBlockInstrument.BANJO)
                .strength(0.5F)
                .sound(SoundType.GRASS)
        )
    }
    val DARK_MATTER_TRANSFORMER: DeferredBlock<Block> = registerBlockWithItem("dark_matter_transformer") {
        DarkMatterTransformerBlock(
            MACHINE_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)
                .instrument(NoteBlockInstrument.BASEDRUM)
        )
    }


    private fun <T : Block> registerBlockWithItem(name: String, block: () -> T) =
        BLOCKS.register(name, block).also { deferredBlock ->
            registerBlockItem(name, deferredBlock)
        }

    private fun <T : Block> registerBlockItem(name: String, block: DeferredBlock<T>) =
        ModItems.ITEMS.register(name) { ->
            BlockItem(block.get(), Item.Properties())
        }

    fun register(eventBus: IEventBus) {
        BLOCKS.register(eventBus)
    }
}