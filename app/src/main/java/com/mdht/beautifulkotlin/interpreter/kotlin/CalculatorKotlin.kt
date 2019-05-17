package com.mdht.beautifulkotlin.interpreter.kotlin

import java.util.*

/**
 * Author: txs
 * Date: 19-5-16 下午9:24
 * Package:com.mdht.beautifulkotlin.interpreter.kotlin
 */
class CalculatorKotlin(expression: String) {
    private val mExpstack = Stack<ArithmeticExpressionKotlin>()

    init {
        var exp1: ArithmeticExpressionKotlin
        var exp2: ArithmeticExpressionKotlin
        var elements = expression.split(" ")
        var i = 0
        while (i < elements.size) {
            when (elements[i]) {
                "+" -> {
                    exp1 = mExpstack.pop()
                    exp2 = NumExpressionKotlin(elements[++i].toInt())
                    mExpstack.push(AdditionExpressionKotlin(exp1,exp2))
                }
                else -> {
                    mExpstack.push(NumExpressionKotlin(elements[i].toInt()))
                }
            }
            i++
        }

    }
    public fun calculate():Int{
        return mExpstack.pop().interpret()
    }

}