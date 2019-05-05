package com.mdht.beautifulkotlin.singleton

import android.util.Log

enum class SingletonEnumKotlin {
    INSTANCE;
    public fun doSomething(){
        Log.d("SingletonEnumKotlin","kotlin 单例方法")
    }
}