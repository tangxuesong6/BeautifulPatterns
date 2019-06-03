package com.mdht.beautifulkotlin.proxy.kotlin.delegation

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.proxy.kotlin.delegation
 */
class XiaominDelegation : IDelegation {
    val TAG = XiaominDelegation::class.java.simpleName
    override fun submit() {
        Log.d(TAG, "谷歌拖欠工资！特此申请仲裁！ ")
    }

    override fun burden() {
        Log.d(TAG, "这是合同书和过去一年的银行工资流水")
    }

    override fun defend() {
        Log.d(TAG, "证据确凿，不需要再说什么了！")
    }

    override fun finish() {
        Log.d(TAG, "诉讼成功，判决谷歌赔钱！")
    }
}