package com.mdht.beautifulkotlin.observer.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.observer.kotlin
 */
class CoderKotlin(val name: String) : ICustomObserver {
    override fun update(content: String) {
        Log.d("CoderKotlin", "Hi, $name,DevTechFrontier更新，内容： $content")
    }
}