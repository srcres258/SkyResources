package top.srcres258.renewal.skyresources

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(SkyResources.MOD_ID)
object SkyResources {
    const val MOD_ID = "skyresources"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(MOD_ID)

    init {
    }
}