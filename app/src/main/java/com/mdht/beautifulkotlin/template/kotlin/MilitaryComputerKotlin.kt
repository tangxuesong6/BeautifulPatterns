package com.mdht.beautifulkotlin.template.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.template.kotlin
 */
class MilitaryComputerKotlin : AbstractComputerKotlin() {
    override fun checkHardware() {
        super.checkHardware()
        Log.d(TAG, "检查硬件防火墙")
    }

    override fun login() {
        Log.d(TAG, "进行指纹识别等复杂的用户验证")
    }
}