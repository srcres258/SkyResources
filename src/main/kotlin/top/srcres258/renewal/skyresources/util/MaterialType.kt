package top.srcres258.renewal.skyresources.util

import net.minecraft.util.StringRepresentable

enum class MaterialType : StringRepresentable {
    /**
     * 木制
     */
    WOOD,

    /**
     * 石制
     */
    STONE,

    /**
     * 青铜
     */
    BRONZE,

    /**
     * 铁制
     */
    IRON,

    /**
     * 钢制
     */
    STEEL,

    /**
     * 琥珀金（热力基本）
     */
    ELECTRUM,

    /**
     * 地狱砖
     */
    NETHER_BRICK,

    /**
     * 铅制
     */
    LEAD,

    /**
     * 玛玉灵（匠魂）
     */
    MANYULLYN,

    /**
     * 信素（热力基本）
     */
    SIGNALUM,

    /**
     * 末地石
     */
    END_STONE,

    /**
     * 末影
     */
    ENDERIUM,

    /**
     * 暗物质
     */
    DARK_MATTER,

    /**
     * 亮物质
     */
    LIGHT_MATTER,

    /**
     * 锇制（通用机械）
     */
    OSMIUM,

    /**
     * 强化黑曜石
     */
    REFINED_OBSIDIAN;

    override fun getSerializedName(): String = name.lowercase()

    override fun toString(): String = getSerializedName()
}