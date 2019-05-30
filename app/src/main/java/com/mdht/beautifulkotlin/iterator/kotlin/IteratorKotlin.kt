package com.mdht.beautifulkotlin.iterator.kotlin

/**
 * Author: txs
 * Date: 19-5-30 下午12:03
 * Package:com.mdht.beautifulkotlin.iterator.kotlin
 */
interface IteratorKotlin<out T> {
    fun hasNext(): Boolean
    fun next(): T?
}