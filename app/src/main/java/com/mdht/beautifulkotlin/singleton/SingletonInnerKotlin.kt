package com.mdht.beautifulkotlin.singleton

import android.util.Log

class SingletonInnerKotlin private constructor(){
    companion object{
        val instance = SingletonHolder.holder
    }
    private object SingletonHolder{
        val holder = SingletonInnerKotlin()
    }
    fun doSomething(){
        Log.d("SingletonInnerKotlin","kotlin 单例方法")
    }
    fun print() = println("Printing with object: $this")
}