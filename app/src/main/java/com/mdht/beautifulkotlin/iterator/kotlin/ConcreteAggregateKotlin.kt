package com.mdht.beautifulkotlin.iterator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.iterator.kotlin
 */
class ConcreteAggregateKotlin<T> : AggregateKotlin<T> {
    private val list = mutableListOf<T>()
    override fun add(obj: T) {
        list.add(obj)
    }

    override fun remove(obj: T) {
        list.remove(obj)
    }

    override fun iterator(): IteratorKotlin<T> {
        return ConcreteIteratorKotlin<T>(list)
    }
}