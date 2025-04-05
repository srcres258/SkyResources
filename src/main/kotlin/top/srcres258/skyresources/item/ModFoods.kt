package top.srcres258.skyresources.item

import net.minecraft.world.food.FoodProperties

object ModFoods {
    val CACTUS_FRUIT: FoodProperties = FoodProperties.Builder()
        .nutrition(6)
        .saturationModifier(1.5F)
        .build()
    val FLESHY_SNOW_NUGGET: FoodProperties = FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(0.1F)
        .build()
}