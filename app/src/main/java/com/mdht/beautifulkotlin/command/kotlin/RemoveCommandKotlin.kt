package com.mdht.beautifulkotlin.command.kotlin

/**
 * Author: txs
 * Date: 19-5-22 下午6:51
 * Package:com.mdht.beautifulkotlin.command.kotlin
 */
class RemoveCommandKotlin(private val receiverKotlin: ReceiverKotlin) : CommandKotlin {
    override fun execute() {
        receiverKotlin.remove()
    }
}