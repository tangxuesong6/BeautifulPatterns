package com.mdht.beautifulkotlin.decorator.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.decorator.kotlin
 */
class ExpensiveClothKotlin(val personKotlin: PersonKotlin) : PersonKotlin by personKotlin {
    val TAG = ExpensiveClothKotlin::class.java.simpleName
    override fun dressed() {
        personKotlin.dressed()
        dressShirt()
        dressLeather()
        dressJean()
    }

    private fun dressJean() {
        Log.d(TAG, "穿条牛仔裤")
    }

    private fun dressLeather() {
        Log.d(TAG, "穿件皮衣")
    }

    private fun dressShirt() {
        Log.d(TAG, "穿件短袖")
    }
}