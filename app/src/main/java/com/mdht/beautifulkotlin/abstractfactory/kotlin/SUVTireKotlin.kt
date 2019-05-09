package com.mdht.beautifulkotlin.abstractfactory.kotlin

import android.util.Log

class SUVTireKotlin : ITireKotlin {
    override fun tire() {
        Log.d("SUVTireKotlin", "SUV 轮胎")
    }
}