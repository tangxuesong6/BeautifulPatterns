package com.mdht.beautifulkotlin.template.kotlin

import android.util.Log

/**
 * Author: txs
 * Date: 19-5-30 下午4:29
 * Package:com.mdht.beautifulkotlin.template.kotlin
 */
abstract class AbstractComputerKotlin {
    val TAG = AbstractComputerKotlin::class.java.simpleName
    open fun powerOn() {
        Log.d(TAG, "开启电源")
    }

    open fun checkHardware() {
        Log.d(TAG, "硬件检查")
    }

    open fun loadOS() {
        Log.d(TAG, "载入操作系统")
    }

    open fun login() {
        Log.d(TAG, "小白的计算机无验证，直接进入系统")
    }

    fun startUp() {
        Log.d(TAG, "------开机 START------")
        powerOn()
        checkHardware()
        loadOS()
        login()
        Log.d(TAG, "------关机 END------")
    }
}