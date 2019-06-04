package com.mdht.beautifulkotlin.decorator.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.decorator.kotlin
 */
class BoyKotlin : PersonKotlin {
    val TAG = BoyKotlin::class.java.simpleName
    override fun dressed() {
        Log.d(TAG, "穿了内衣内裤")
    }
}