package com.mdht.beautifulkotlin.composite.kotlin

import android.util.Log

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.composite.kotlin
 */
class LeafKotlin(name: String) : ComponentKotlin(name) {
    private val TAG = LeafKotlin::class.java.simpleName
    override fun doSomething() {
        Log.d(TAG, name)
    }

    override fun addChild(child: ComponentKotlin) {
        throw UnsupportedOperationException("叶子节点没有子节点")
    }

    override fun removeChild(child: ComponentKotlin) {
        throw UnsupportedOperationException("叶子节点没有子节点")
    }

    override fun getChildren(index: Int): ComponentKotlin {
        throw UnsupportedOperationException("叶子节点没有子节点")
    }
}