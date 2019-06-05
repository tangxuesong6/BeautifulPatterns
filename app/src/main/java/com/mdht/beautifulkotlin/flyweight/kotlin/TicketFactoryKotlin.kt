package com.mdht.beautifulkotlin.flyweight.kotlin

import android.util.Log
import java.util.*

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.flyweight.kotlin
 */
class TicketFactoryKotlin {

    companion object {
        private val TAG = TicketFactoryKotlin::class.java.simpleName
        private var sTicketMap: MutableMap<String, TicketKotlin> = HashMap()
        fun getTicket(from: String, to: String): TicketKotlin? {
            val key = "$from-$to"
            if (sTicketMap.containsKey(key)) {
                Log.d(TAG, "使用缓存 ==>$key")
                return sTicketMap[key]
            } else {
                Log.d(TAG, "创建对象 ==>$key")
                val ticketKotlin = TrainTicketKotlin(from, to)
                sTicketMap[key] = ticketKotlin
                return ticketKotlin
            }
        }
    }


}