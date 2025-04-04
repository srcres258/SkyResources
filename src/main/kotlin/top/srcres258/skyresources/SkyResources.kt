package top.srcres258.skyresources

import net.minecraft.client.renderer.entity.EntityRenderers
import net.minecraft.client.renderer.entity.ThrownItemRenderer
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import top.srcres258.skyresources.block.ModBlocks
import top.srcres258.skyresources.entity.ModEntities
import top.srcres258.skyresources.item.ModCreativeModeTabs
import top.srcres258.skyresources.item.ModItems

@Mod(SkyResources.MOD_ID)
object SkyResources {
    const val MOD_ID = "skyresources"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(MOD_ID)

    init {
        LOGGER.info("$MOD_ID is loading...")

        ModCreativeModeTabs.register(MOD_BUS)
        ModItems.register(MOD_BUS)
        ModBlocks.register(MOD_BUS)
        ModEntities.register(MOD_BUS)
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = [Dist.CLIENT])
    object ClientModEvents {
        @SubscribeEvent
        fun onClientSetup(event: FMLClientSetupEvent) {
            EntityRenderers.register(ModEntities.HEAVY_SNOWBALL.get(), ::ThrownItemRenderer)
            EntityRenderers.register(ModEntities.EXPLOSIVE_HEAVY_SNOWBALL.get(), ::ThrownItemRenderer)
        }
    }
}