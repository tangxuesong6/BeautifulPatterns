package com.mdht.beautifulkotlin.visitor.kotlin

/**
 * Author: txs
 * Date: 19-5-30 下午7:59
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
interface VisitorKotlin {
    fun visit(visitor: EngineerKotlin)
    fun visit(visitor: ManagerKotlin)
}