package top.srcres258.renewal.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider
import top.srcres258.renewal.skyresources.SkyResources
import java.util.concurrent.CompletableFuture

class ModGlobalLootModifierProvider(
    output: PackOutput,
    registries: CompletableFuture<HolderLookup.Provider>
) : GlobalLootModifierProvider(output, registries, SkyResources.MOD_ID) {
    override fun start() {}
}