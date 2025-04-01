package top.srcres258.renewal.skyresources.entity.custom

import net.minecraft.core.particles.ItemParticleOption
import net.minecraft.core.particles.ParticleOptions
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.monster.Blaze
import net.minecraft.world.entity.projectile.ThrowableItemProjectile
import net.minecraft.world.item.Item
import net.minecraft.world.level.Level
import net.minecraft.world.phys.EntityHitResult
import net.minecraft.world.phys.HitResult
import top.srcres258.renewal.skyresources.entity.ModEntities
import top.srcres258.renewal.skyresources.item.ModItems

open class HeavySnowball : ThrowableItemProjectile {
    constructor(entityType: EntityType<out HeavySnowball>, level: Level) : super(entityType, level)

    constructor(level: Level, shooter: LivingEntity) : this(ModEntities.HEAVY_SNOWBALL.get(), shooter, level)

    constructor(level: Level, x: Double, y: Double, z: Double) : this(ModEntities.HEAVY_SNOWBALL.get(), x, y, z, level)

    protected constructor(entityType: EntityType<out HeavySnowball>, shooter: LivingEntity, level: Level) :
            super(entityType, shooter, level)

    protected constructor(entityType: EntityType<out HeavySnowball>, x: Double, y: Double, z: Double, level: Level) :
            super(entityType, x, y, z, level)

    override fun getDefaultItem(): Item = ModItems.HEAVY_SNOWBALL.get()

    private val particle: ParticleOptions
        get() = item.let { stack ->
            if (!stack.isEmpty && !stack.`is`(defaultItem)) {
                ItemParticleOption(ParticleTypes.ITEM, stack)
            } else {
                ParticleTypes.ITEM_SNOWBALL
            }
        }

    override fun handleEntityEvent(id: Byte) {
        if (id == 3.toByte()) {
            val options = particle

            for (i in 0 ..< 8) {
                level().addParticle(options, x, y, z, 0.0, 0.0, 0.0)
            }
        }
    }

    override fun onHitEntity(result: EntityHitResult) {
        super.onHitEntity(result)

        val entity = result.entity
        val i = if (entity is Blaze) 3 else 0
        entity.hurt(damageSources().thrown(this, owner), i.toFloat())
    }

    override fun onHit(result: HitResult) {
        super.onHit(result)

        if (!level().isClientSide) {
            level().broadcastEntityEvent(this, 3)
            discard()
        }
    }
}