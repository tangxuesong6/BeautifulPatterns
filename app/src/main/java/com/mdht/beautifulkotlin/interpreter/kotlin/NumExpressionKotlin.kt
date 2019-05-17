package com.mdht.beautifulkotlin.interpreter.kotlin

class NumExpressionKotlin(num : Int) : ArithmeticExpressionKotlin() {
    private var num : Int = num
    override fun interpret(): Int {
        return num
    }
}