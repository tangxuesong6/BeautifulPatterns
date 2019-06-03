package com.mdht.beautifulkotlin.visitor.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
interface VisitorKotlin {
    fun visit(visitor: EngineerKotlin)
    fun visit(visitor: ManagerKotlin)
}