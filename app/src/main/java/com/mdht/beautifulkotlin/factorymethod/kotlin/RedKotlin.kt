package com.mdht.beautifulkotlin.factorymethod.kotlin

import android.util.Log

class RedKotlin : IColorKotlin {
    override fun show() {
        Log.d("RedKotlin", "RedKotlin---> show")
    }
}