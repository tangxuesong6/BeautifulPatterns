package com.mdht.beautifulkotlin.bridge.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.bridge.kotlin
 */
class SmallCoffeeKotlin(impl: CoffeeAdditivesKotlin) : CoffeeKotlin(impl) {
    private val TAG = SmallCoffeeKotlin::class.java.simpleName
    override fun makeCoffee() {
        Log.d(TAG, "小杯的 ${impl.addSomething()} 咖啡")
    }
}