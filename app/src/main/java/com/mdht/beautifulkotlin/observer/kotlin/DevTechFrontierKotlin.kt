package com.mdht.beautifulkotlin.observer.kotlin

import kotlin.properties.Delegates

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.observer.kotlin
 */
class DevTechFrontierKotlin {
    val list = mutableListOf<CoderKotlin>()
    fun addMyObserver(coderKotlin: CoderKotlin){
        list.add(coderKotlin)
    }
    var postNewPublication: String by Delegates.observable("默认值") { _, _, content ->
        run {
            for (coder in list){
                coder.update(content)
            }
        }
    }
}