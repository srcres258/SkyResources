package top.srcres258.renewal.skyresources.item

import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.renewal.skyresources.SkyResources

object ModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(SkyResources.MOD_ID)

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}