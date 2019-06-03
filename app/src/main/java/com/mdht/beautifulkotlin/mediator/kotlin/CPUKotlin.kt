package com.mdht.beautifulkotlin.mediator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.mediator.kotlin
 */
class CPUKotlin(mediatorKotlin: MediatorKotlin) : ColleagueKotlin(mediatorKotlin) {
    private var dataVideo: String? = null
    private var dataSound: String? = null
    fun getDataVideo(): String? {
        return dataVideo
    }

    fun getDataSound(): String? {
        return dataSound
    }

    fun decodeData(data: String?) {
        val tmp = data?.split(",")
        dataVideo = tmp?.get(0)
        dataSound = tmp?.get(1)
        mediatorKotlin.changed(this)
    }


}