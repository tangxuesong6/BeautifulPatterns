package com.mdht.beautifulkotlin.iterator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.iterator.kotlin
 */
interface IteratorKotlin<out T> {
    fun hasNext(): Boolean
    fun next(): T?
}