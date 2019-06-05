package com.mdht.beautifulkotlin.facade.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.facade.kotlin
 */
class SamsungCameraKotlin : CameraKotlin {
    private val TAG = SamsungCameraKotlin::class.java.simpleName
    override fun open() {
        Log.d(TAG, "打开相机")
    }

    override fun takePicture() {
        Log.d(TAG, "拍照")
    }

    override fun close() {
        Log.d(TAG, "关闭相机")
    }
}