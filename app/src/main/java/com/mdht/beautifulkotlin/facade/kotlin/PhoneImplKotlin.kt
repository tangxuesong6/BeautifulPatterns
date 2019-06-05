package com.mdht.beautifulkotlin.facade.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.facade.kotlin
 */
class PhoneImplKotlin : PhoneKotlin {
    private val TAG = PhoneImplKotlin::class.java.simpleName
    override fun dail() {
        Log.d(TAG, "打电话")
    }

    override fun hangup() {
        Log.d(TAG, "挂断")
    }
}