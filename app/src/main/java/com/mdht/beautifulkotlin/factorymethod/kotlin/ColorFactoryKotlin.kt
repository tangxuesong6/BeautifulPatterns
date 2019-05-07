package com.mdht.beautifulkotlin.factorymethod.kotlin

class ColorFactoryKotlin {
    companion object {
        fun getColor(enumKotlin: EnumKotlin): IColorKotlin? {
            return when (enumKotlin) {
                EnumKotlin.RED -> RedKotlin()
                EnumKotlin.YELLOW -> YellowKotlin()
            }
        }
    }
}