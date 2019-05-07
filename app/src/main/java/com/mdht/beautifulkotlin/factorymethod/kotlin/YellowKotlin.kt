package com.mdht.beautifulkotlin.factorymethod.kotlin

import android.util.Log

class YellowKotlin : IColorKotlin {
    override fun show() {
        Log.d("YellowKotlin", "YellowKotlin---> show")
    }
}