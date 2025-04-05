package top.srcres258.skyresources.util

import net.minecraft.util.StringRepresentable

enum class OreType : StringRepresentable {
    /**
     * 铁
     */
    IRON,

    /**
     * 金
     */
    GOLD,

    /**
     * 铜
     */
    COPPER,

    /**
     * 锡
     */
    TIN,

    /**
     * 银
     */
    SILVER,

    /**
     * 锌
     */
    ZINC,

    /**
     * 镍
     */
    NICKEL,

    /**
     * 铂
     */
    PLATINUM,

    /**
     * 铝
     */
    ALUMINUM,

    /**
     * 铅
     */
    LEAD,

    /**
     * 钴
     */
    COBALT,

    /**
     * 阿迪特
     */
    ARDITE,

    /**
     * 锇
     */
    OSMIUM,

    /**
     * 龙
     */
    DRACONIUM,

    /**
     * 钛
     */
    TITANIUM,

    /**
     * 钨
     */
    TUNGSTEN,

    /**
     * 铬
     */
    CHROME,

    /**
     * 铱
     */
    IRIDIUM,

    /**
     * 硼
     */
    BORON,

    /**
     * 锂
     */
    LITHIUM,

    /**
     * 镁
     */
    MAGNESIUM,

    /**
     * 铋
     */
    MITHRIL,

    /**
     * 黄铀
     */
    YELLORIUM,

    /**
     * 铀
     */
    URANIUM,

    /**
     * 钍
     */
    THORIUM;

    override fun getSerializedName(): String = name.lowercase()

    override fun toString(): String = getSerializedName()
}