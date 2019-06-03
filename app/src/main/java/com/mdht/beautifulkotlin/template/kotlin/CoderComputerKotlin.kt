package com.mdht.beautifulkotlin.template.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.template.kotlin
 */
class CoderComputerKotlin : AbstractComputerKotlin() {
    override fun login() {
        Log.d(TAG, "程序员只需要进行用户和密码验证就可以了")
    }
}