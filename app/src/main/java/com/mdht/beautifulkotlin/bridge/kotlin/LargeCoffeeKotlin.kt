package com.mdht.beautifulkotlin.bridge.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.bridge.kotlin
 */
class LargeCoffeeKotlin(impl: CoffeeAdditivesKotlin) : CoffeeKotlin(impl) {
    private val TAG = LargeCoffeeKotlin::class.java.simpleName
    override fun makeCoffee() {
        Log.d(TAG, "大杯的${impl.addSomething()} 咖啡")
    }
}