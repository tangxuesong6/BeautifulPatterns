package com.mdht.beautifulkotlin.adapter.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.adapter.kotlin
 */
class VoltAdapterKotlin(val mVolt220Kotlin: Volt220Kotlin) : FiveVoltKotlin {
    override fun getVolt5(): Int {
        return 5
    }

    fun getVolt220(): Int {
        return mVolt220Kotlin.getVolt220()
    }
}