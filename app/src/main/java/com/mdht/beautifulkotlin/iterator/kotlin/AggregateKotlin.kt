package com.mdht.beautifulkotlin.iterator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.iterator.kotlin
 */
interface AggregateKotlin<T> {
    fun add(obj: T)
    fun remove(obj: T)
    fun iterator(): IteratorKotlin<T>
}