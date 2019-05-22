package com.mdht.beautifulkotlin.command.kotlin

/**
 * Author: txs
 * Date: 19-5-22 下午6:53
 * Package:com.mdht.beautifulkotlin.command.kotlin
 */
class InvokerKotlin {
    private lateinit var addCommandKotlin: AddCommandKotlin
    private lateinit var removeCommandKotlin: RemoveCommandKotlin
    private val list = mutableListOf<CommandKotlin>()
    fun setAddCommand(addCommandKotlin: AddCommandKotlin) {
        this.addCommandKotlin = addCommandKotlin
        list.add(addCommandKotlin)
    }

    fun setRemoveCommand(removeCommandKotlin: RemoveCommandKotlin) {
        this.removeCommandKotlin = removeCommandKotlin
        list.add(removeCommandKotlin)
    }

    fun undo() {
        if (list.size > 0) {
            list.removeAt(list.lastIndex)
        }
    }

    fun processCommands() {
        list.forEach { it.execute() }
        list.clear()
    }
}