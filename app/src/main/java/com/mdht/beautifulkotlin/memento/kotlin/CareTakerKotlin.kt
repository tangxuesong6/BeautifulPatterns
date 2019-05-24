package com.mdht.beautifulkotlin.memento.kotlin

/**
 * Author: txs
 * Date: 19-5-24 下午2:28
 * Package:com.mdht.beautifulkotlin.memento.kotlin
 */
class CareTakerKotlin {
    private val mementoList = ArrayList<MementoKotlin>()
    fun saveState(state: MementoKotlin) {
        mementoList.add(state)
    }
    fun restore(index: Int): MementoKotlin {
        return mementoList[index]
    }
}