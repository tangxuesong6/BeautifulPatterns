package com.mdht.beautifulkotlin.visitor.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
class CEOVisitorKotlin : VisitorKotlin {
    private val TAG = CEOVisitorKotlin::class.java.simpleName
    override fun visit(visitor: ManagerKotlin) {
        Log.d(TAG, "经理： " + visitor.name + ", KPI" + visitor.kpi + "， 新产品数量 ：" + visitor.product)
    }

    override fun visit(visitor: EngineerKotlin) {
        Log.d(TAG, "工程师： " + visitor.name + ", KPI" + visitor.kpi)
    }
}