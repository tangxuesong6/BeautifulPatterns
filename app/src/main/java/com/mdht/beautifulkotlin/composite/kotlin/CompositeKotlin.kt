package com.mdht.beautifulkotlin.composite.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.composite.kotlin
 */
class CompositeKotlin(name: String) : ComponentKotlin(name) {
    private val TAG = ComponentKotlin::class.java.simpleName
    private val components = mutableListOf<ComponentKotlin>()
    override fun doSomething() {
        Log.d(TAG, name)
        if (components.size > 0) {
            for (c in components) {
                c.doSomething()
            }
        }
    }

    override fun addChild(child: ComponentKotlin) {
        components.add(child)
    }

    override fun removeChild(child: ComponentKotlin) {
        components.remove(child)
    }

    override fun getChildren(index: Int): ComponentKotlin {
        return components[index]
    }
}