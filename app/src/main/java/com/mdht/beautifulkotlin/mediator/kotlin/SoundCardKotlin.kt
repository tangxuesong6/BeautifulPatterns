package com.mdht.beautifulkotlin.mediator.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.mediator.kotlin
 */
class SoundCardKotlin(mediatorKotlin: MediatorKotlin) : ColleagueKotlin(mediatorKotlin) {
    private val TAG = SoundCardKotlin::class.java.simpleName
    fun soundPlay(data: String?) {
        Log.d(TAG, data)
    }
}