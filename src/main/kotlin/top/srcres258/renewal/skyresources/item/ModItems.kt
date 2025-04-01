package top.srcres258.renewal.skyresources.item

import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.renewal.skyresources.SkyResources
import top.srcres258.renewal.skyresources.item.custom.ExplosiveHeavySnowballItem
import top.srcres258.renewal.skyresources.item.custom.HeavySnowballItem

object ModItems {
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(SkyResources.MOD_ID)

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

    private fun <T : Item> registerItem(name: String, item: () -> T) = ITEMS.register(name) { -> item() }

    fun register(eventBus: IEventBus) {
        ITEMS.register(eventBus)
    }
}