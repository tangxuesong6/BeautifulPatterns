package com.mdht.beautifulkotlin.facade.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.facade.kotlin
 */
class MobilePhoneKotlin {
    private val TAG = MobilePhoneKotlin::class.java.simpleName
    val mPhone = PhoneImplKotlin()
    val mCamera = SamsungCameraKotlin()
    fun dail() {
        mPhone.dail()
    }

    fun videoChat() {
        Log.d(TAG, "-->视频聊天接通中")
        mCamera.open()
        mPhone.dail()
    }

    fun hangup() {
        mPhone.hangup()
    }

    fun closeCamera() {
        mCamera.close()
    }
}