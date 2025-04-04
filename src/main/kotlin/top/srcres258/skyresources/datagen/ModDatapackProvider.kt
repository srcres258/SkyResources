package top.srcres258.skyresources.datagen

import net.minecraft.core.HolderLookup
import net.minecraft.core.RegistrySetBuilder
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider
import top.srcres258.skyresources.SkyResources
import java.util.concurrent.CompletableFuture

class ModDatapackProvider(
    output: PackOutput,
    registries: CompletableFuture<HolderLookup.Provider>
) : DatapackBuiltinEntriesProvider(output, registries, BUILDER, setOf(SkyResources.MOD_ID)) {
    companion object {
        val BUILDER: RegistrySetBuilder = RegistrySetBuilder()
    }
}