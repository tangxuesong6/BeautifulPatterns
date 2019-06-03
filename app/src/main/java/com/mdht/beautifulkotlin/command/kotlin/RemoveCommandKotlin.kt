package com.mdht.beautifulkotlin.command.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.command.kotlin
 */
class RemoveCommandKotlin(private val receiverKotlin: ReceiverKotlin) : CommandKotlin {
    override fun execute() {
        receiverKotlin.remove()
    }
}