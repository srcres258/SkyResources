package top.srcres258.skyresources.item.custom

import net.minecraft.core.Direction
import net.minecraft.core.Position
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.stats.Stats
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.player.Player
import net.minecraft.world.entity.projectile.Projectile
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.ProjectileItem
import net.minecraft.world.level.Level
import top.srcres258.skyresources.entity.custom.HeavySnowball

open class HeavySnowballItem(properties: Properties) : Item(properties), ProjectileItem {
    override fun use(level: Level, player: Player, usedHand: InteractionHand): InteractionResultHolder<ItemStack> =
        use(level, player, usedHand) { HeavySnowball(level, player) }

    protected fun <T : HeavySnowball> use(
        level: Level,
        player: Player,
        usedHand: InteractionHand,
        snowballCreator: () -> T
    ): InteractionResultHolder<ItemStack> {
        val stack = player.getItemInHand(usedHand)
        level.playSound(
            null,
            player.x,
            player.y,
            player.z,
            SoundEvents.SNOWBALL_THROW,
            SoundSource.NEUTRAL,
            0.5F,
            0.4F / (level.random.nextFloat() * 0.4F + 0.8F)
        )
        if (!level.isClientSide) {
            val snowball = HeavySnowball(level, player)
            snowball.item = stack
            snowball.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 1.5F, 1.0F)
            level.addFreshEntity(snowball)
        }

        player.awardStat(Stats.ITEM_USED.get(this))
        stack.consume(1, player)
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide)
    }

    override fun asProjectile(level: Level, pos: Position, stack: ItemStack, direction: Direction): Projectile =
        HeavySnowball(level, pos.x(), pos.y(), pos.z()).also { snowball ->
            snowball.item = stack
        }
}