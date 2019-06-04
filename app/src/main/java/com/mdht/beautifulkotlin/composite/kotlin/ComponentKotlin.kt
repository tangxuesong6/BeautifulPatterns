package com.mdht.beautifulkotlin.composite.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.composite.kotlin
 */
abstract class ComponentKotlin(protected val name: String) {
    abstract fun doSomething()
    abstract fun addChild(child: ComponentKotlin)
    abstract fun removeChild(child: ComponentKotlin)
    abstract fun getChildren(index: Int): ComponentKotlin
}