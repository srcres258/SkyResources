package top.srcres258.skyresources.block

import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent
import net.neoforged.neoforge.fluids.FluidType
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import net.neoforged.neoforge.registries.NeoForgeRegistries
import top.srcres258.skyresources.SkyResources

private val CRYSTAL_FLUID_STILL: ResourceLocation = ResourceLocation.fromNamespaceAndPath(SkyResources.MOD_ID,
    "block/crystal_fluid_still")
private val CRYSTAL_FLUID_FLOW: ResourceLocation = ResourceLocation.fromNamespaceAndPath(SkyResources.MOD_ID,
    "block/crystal_fluid_flow")
private val CRYSTAL_FLUID_OVERLAY: ResourceLocation = ResourceLocation.withDefaultNamespace("block/obsidian")
private val DIRTY_CRYSTAL_FLUID_STILL: ResourceLocation = ResourceLocation.fromNamespaceAndPath(SkyResources.MOD_ID,
    "block/crystal_fluid_still")
private val DIRTY_CRYSTAL_FLUID_FLOW: ResourceLocation = ResourceLocation.fromNamespaceAndPath(SkyResources.MOD_ID,
    "block/crystal_fluid_flow")
private val DIRTY_CRYSTAL_FLUID_OVERLAY: ResourceLocation = ResourceLocation.withDefaultNamespace("block/obsidian")

object ModFluidTypes {
    val FLUID_TYPES: DeferredRegister<FluidType> = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, SkyResources.MOD_ID)

    val CRYSTAL_FLUID: DeferredHolder<FluidType, FluidType> = registerFluidType("crystal_fluid") {
        FluidType(
            FluidType.Properties.create()
                .canDrown(false)
        )
    }
    val DIRTY_CRYSTAL_FLUID: DeferredHolder<FluidType, FluidType> = registerFluidType("dirty_crystal_fluid") {
        FluidType(
            FluidType.Properties.create()
                .canDrown(false)
        )
    }

    fun register(eventBus: IEventBus) {
        FLUID_TYPES.register(eventBus)
    }

    fun registerClientExtensions(event: RegisterClientExtensionsEvent) {
        event.registerFluidType(
            object : IClientFluidTypeExtensions {
                override fun getStillTexture(): ResourceLocation = CRYSTAL_FLUID_STILL
                override fun getFlowingTexture(): ResourceLocation = CRYSTAL_FLUID_FLOW
                override fun getOverlayTexture(): ResourceLocation = CRYSTAL_FLUID_OVERLAY
                override fun getTintColor(): Int = 0x7FE2E2E2
            },
            CRYSTAL_FLUID.get()
        )
        event.registerFluidType(
            object : IClientFluidTypeExtensions {
                override fun getStillTexture(): ResourceLocation = DIRTY_CRYSTAL_FLUID_STILL
                override fun getFlowingTexture(): ResourceLocation = DIRTY_CRYSTAL_FLUID_FLOW
                override fun getOverlayTexture(): ResourceLocation = DIRTY_CRYSTAL_FLUID_OVERLAY
                override fun getTintColor(): Int = 0x7FD29239
            },
            DIRTY_CRYSTAL_FLUID.get()
        )
    }

    private fun registerFluidType(name: String, fluidTypeSup: () -> FluidType) =
        FLUID_TYPES.register(name) { -> fluidTypeSup() }
}