package com.mdht.beautifulkotlin.visitor.kotlin

import kotlin.random.Random

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
class EngineerKotlin(name: String) : StaffKotlin(name) {

    override fun accept(visitorKotlin: VisitorKotlin) {
        visitorKotlin.visit(this)
    }

    fun getCodeLines(): Int {
        return (0..100000).random()
    }

}