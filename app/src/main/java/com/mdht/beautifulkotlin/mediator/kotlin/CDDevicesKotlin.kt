package com.mdht.beautifulkotlin.mediator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.mediator.kotlin
 */
class CDDevicesKotlin(mediatorKotlin: MediatorKotlin) : ColleagueKotlin(mediatorKotlin) {
    private var data: String? = null
    fun read(): String? {
        return data
    }

    fun load() {
        data = "视频数据,音频数据"
        mediatorKotlin.changed(this)
    }
}