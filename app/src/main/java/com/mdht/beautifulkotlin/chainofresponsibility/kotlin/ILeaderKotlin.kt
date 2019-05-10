package com.mdht.beautifulkotlin.chainofresponsibility.kotlin

abstract class ILeaderKotlin {
    var nextHandler: ILeaderKotlin? = null
    fun handleRequest(money: Int) {
        if (money <= limit()) {
            handle(money)
        } else {
            if (nextHandler != null) {
                money.let { nextHandler?.handleRequest(it) }
//                nextHandler?.handleRequest(money)
            }
        }

    }

    abstract fun limit(): Int

    abstract fun handle(money: Int)

}