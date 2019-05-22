package com.mdht.beautifulkotlin.command.kotlin

/**
 * Author: txs
 * Date: 19-5-22 下午6:47
 * Package:com.mdht.beautifulkotlin.command.kotlin
 */
class AddCommandKotlin(private val receiverKotlin: ReceiverKotlin) : CommandKotlin {
    override fun execute() {
        receiverKotlin.add()
    }
}