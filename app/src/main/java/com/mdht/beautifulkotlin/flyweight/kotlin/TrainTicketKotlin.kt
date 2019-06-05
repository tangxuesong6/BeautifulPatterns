package com.mdht.beautifulkotlin.flyweight.kotlin

import android.util.Log
import java.util.*


/**
 * Author: txs
 */
class TrainTicketKotlin(val from: String, val to: String) : TicketKotlin {
    val TAG = TrainTicketKotlin::class.java.simpleName
    var price: Int = 0
    override fun showTicketInfo(bunk: String) {
        price = Random().nextInt(300)
        Log.d(TAG, "购买 从 $from 到 $to 的 $bunk 火车票，价格： $price")
    }
}