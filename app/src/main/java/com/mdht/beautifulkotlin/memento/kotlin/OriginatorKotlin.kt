package com.mdht.beautifulkotlin.memento.kotlin


class OriginatorKotlin(var state: String) {
    fun createMemento(): MementoKotlin {
        return MementoKotlin(state)
    }

    fun restore(memento: MementoKotlin) {
        state = memento.state
    }

}