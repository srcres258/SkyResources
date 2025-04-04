package top.srcres258.skyresources.item.custom

import net.minecraft.core.Direction
import net.minecraft.core.Position
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.player.Player
import net.minecraft.world.entity.projectile.Projectile
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import top.srcres258.skyresources.entity.custom.ExplosiveHeavySnowball

class ExplosiveHeavySnowballItem(properties: Properties) : HeavySnowballItem(properties) {
    override fun use(level: Level, player: Player, usedHand: InteractionHand): InteractionResultHolder<ItemStack> =
        use(level, player, usedHand) { ExplosiveHeavySnowball(level, player) }

    override fun asProjectile(level: Level, pos: Position, stack: ItemStack, direction: Direction): Projectile =
        ExplosiveHeavySnowball(level, pos.x(), pos.y(), pos.z()).also { snowball ->
            snowball.item = stack
        }
}