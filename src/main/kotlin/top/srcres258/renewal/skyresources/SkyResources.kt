package top.srcres258.renewal.skyresources

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import top.srcres258.renewal.skyresources.block.ModBlocks
import top.srcres258.renewal.skyresources.item.ModCreativeModeTabs
import top.srcres258.renewal.skyresources.item.ModItems

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
    }
}