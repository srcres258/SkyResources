package top.srcres258.skyresources.block

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.LiquidBlock
import net.minecraft.world.level.material.Fluid
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.fluids.BaseFlowingFluid
import net.neoforged.neoforge.fluids.FluidType
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.skyresources.SkyResources
import java.util.function.Supplier

object ModFluids {
    val FLUIDS: DeferredRegister<Fluid> = DeferredRegister.create(BuiltInRegistries.FLUID, SkyResources.MOD_ID)

    lateinit var CRYSTAL_FLUID: DeferredHolder<Fluid, out Fluid>
        private set
    lateinit var CRYSTAL_FLUID_FLOWING: DeferredHolder<Fluid, out Fluid>
        private set
    lateinit var DIRTY_CRYSTAL_FLUID: DeferredHolder<Fluid, out Fluid>
        private set
    lateinit var DIRTY_CRYSTAL_FLUID_FLOWING: DeferredHolder<Fluid, out Fluid>
        private set

    init {
        CRYSTAL_FLUID = registerFluid("crystal_fluid") {
            BaseFlowingFluid.Source(makeProperties(
                ModFluidTypes.CRYSTAL_FLUID,
                CRYSTAL_FLUID,
                CRYSTAL_FLUID_FLOWING,
                { ModBlocks.CRYSTAL_FLUID.get() as LiquidBlock }
            ))
        }
        CRYSTAL_FLUID_FLOWING = registerFluid("crystal_fluid_flowing") {
            BaseFlowingFluid.Flowing(makeProperties(
                ModFluidTypes.CRYSTAL_FLUID,
                CRYSTAL_FLUID,
                CRYSTAL_FLUID_FLOWING,
                { ModBlocks.CRYSTAL_FLUID.get() as LiquidBlock }
            ))
        }
        DIRTY_CRYSTAL_FLUID = registerFluid("dirty_crystal_fluid") {
            BaseFlowingFluid.Source(makeProperties(
                ModFluidTypes.DIRTY_CRYSTAL_FLUID,
                DIRTY_CRYSTAL_FLUID,
                DIRTY_CRYSTAL_FLUID_FLOWING,
                { ModBlocks.DIRTY_CRYSTAL_FLUID.get() as LiquidBlock }
            ))
        }
        DIRTY_CRYSTAL_FLUID_FLOWING = registerFluid("dirty_crystal_fluid_flowing") {
            BaseFlowingFluid.Flowing(makeProperties(
                ModFluidTypes.DIRTY_CRYSTAL_FLUID,
                DIRTY_CRYSTAL_FLUID,
                DIRTY_CRYSTAL_FLUID_FLOWING,
                { ModBlocks.DIRTY_CRYSTAL_FLUID.get() as LiquidBlock }
            ))
        }
    }

    fun register(eventBus: IEventBus) {
        FLUIDS.register(eventBus)
    }

    private fun registerFluid(name: String, fluidSup: () -> Fluid) =
        FLUIDS.register(name) { -> fluidSup() }

    private fun makeProperties(
        fluidType: Supplier<out FluidType>,
        still: Supplier<out Fluid>,
        flowing: Supplier<out Fluid>,
        block: Supplier<out LiquidBlock>,
        bucket: Supplier<out Item>? = null
    ) = BaseFlowingFluid.Properties(fluidType, still, flowing)
        .also { properties ->
            if (bucket != null) {
                properties.bucket(bucket)
            }
        }
        .block(block)
}