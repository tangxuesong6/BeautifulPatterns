package com.mdht.beautifulkotlin.mediator.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.mediator.kotlin
 */
class GraphicsCardKotlin(mediatorKotlin: MediatorKotlin) : ColleagueKotlin(mediatorKotlin) {
    private val TAG = GraphicsCardKotlin::class.java.simpleName
    fun videoPlay(data: String?) {
        Log.d(TAG, data)
    }
}