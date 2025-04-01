package top.srcres258.renewal.skyresources.entity.custom

import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.item.Item
import net.minecraft.world.level.Level
import top.srcres258.renewal.skyresources.entity.ModEntities
import top.srcres258.renewal.skyresources.item.ModItems

class ExplosiveHeavySnowball : HeavySnowball {
    constructor(entityType: EntityType<out HeavySnowball>, level: Level) : super(entityType, level)

    constructor(level: Level, shooter: LivingEntity) :
            super(ModEntities.EXPLOSIVE_HEAVY_SNOWBALL.get(), shooter, level)

    constructor(level: Level, x: Double, y: Double, z: Double) :
            super(ModEntities.EXPLOSIVE_HEAVY_SNOWBALL.get(), x, y, z, level)

    override fun getDefaultItem(): Item = ModItems.EXPLOSIVE_HEAVY_SNOWBALL.get()
}