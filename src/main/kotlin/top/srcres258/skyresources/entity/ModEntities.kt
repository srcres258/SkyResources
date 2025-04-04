package top.srcres258.skyresources.entity

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import top.srcres258.skyresources.SkyResources
import top.srcres258.skyresources.entity.custom.ExplosiveHeavySnowball
import top.srcres258.skyresources.entity.custom.HeavySnowball

object ModEntities {
    val ENTITY_TYPES: DeferredRegister<EntityType<*>> =
        DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SkyResources.MOD_ID)

    val HEAVY_SNOWBALL: DeferredHolder<EntityType<*>, EntityType<HeavySnowball>> =
        registerEntity("heavy_snowball") {
            EntityType.Builder.of(::HeavySnowball, MobCategory.MISC)
                .sized(0.3125F, 0.3125F)
                .clientTrackingRange(4)
                .updateInterval(10)
                .build("heavy_snowball")
        }
    val EXPLOSIVE_HEAVY_SNOWBALL: DeferredHolder<EntityType<*>, EntityType<ExplosiveHeavySnowball>> =
        registerEntity("explosive_heavy_snowball") {
            EntityType.Builder.of(::ExplosiveHeavySnowball, MobCategory.MISC)
                .sized(0.3125F, 0.3125F)
                .clientTrackingRange(4)
                .updateInterval(10)
                .build("explosive_heavy_snowball")
        }

    private fun <T : Entity> registerEntity(name: String, sup: () -> EntityType<T>) =
        ENTITY_TYPES.register(name) { -> sup() }

    fun register(eventBus: IEventBus) {
        ENTITY_TYPES.register(eventBus)
    }
}