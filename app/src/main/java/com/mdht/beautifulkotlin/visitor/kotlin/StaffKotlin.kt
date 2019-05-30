package com.mdht.beautifulkotlin.visitor.kotlin

/**
 * Author: txs
 * Date: 19-5-30 下午7:52
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
abstract class StaffKotlin(val name: String) {
    var kpi: Int

    init {
        kpi = (0..10).random()
    }

    abstract fun accept(visitorKotlin: VisitorKotlin)
}