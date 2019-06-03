package com.mdht.beautifulkotlin.visitor.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
class CTOVisitorKotlin : VisitorKotlin {
    private val TAG = CTOVisitorKotlin::class.java.simpleName
    override fun visit(visitor: EngineerKotlin) {
        Log.d(TAG, "工程师： " + visitor.name + ", 代码行数： " + visitor.getCodeLines())
    }

    override fun visit(visitor: ManagerKotlin) {
        Log.d(TAG, "经理： " + visitor.name + "， 新产品数量 ：" + visitor.product)
    }
}