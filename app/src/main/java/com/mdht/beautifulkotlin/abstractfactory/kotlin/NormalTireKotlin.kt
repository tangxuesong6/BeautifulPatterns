package com.mdht.beautifulkotlin.abstractfactory.kotlin

import android.util.Log

class NormalTireKotlin : ITireKotlin {
    override fun tire() {
        Log.d("NormalTireKotlin", "普通轮胎")    }
}