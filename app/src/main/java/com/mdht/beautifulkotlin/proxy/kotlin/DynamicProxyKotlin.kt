package com.mdht.beautifulkotlin.proxy.kotlin

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.proxy.kotlin
 */
class DynamicProxyKotlin(private val obj: Any) : InvocationHandler {
    override fun invoke(o: Any?, method: Method?, objects: Array<Any>?): Any? {
        return method?.invoke(obj, *objects.orEmpty())
    }
}