package com.mdht.beautifulkotlin.interpreter.kotlin

abstract class OpretatorExpressionKotlin(exp1: ArithmeticExpressionKotlin, exp2: ArithmeticExpressionKotlin) :
    ArithmeticExpressionKotlin() {
    protected val exp1: ArithmeticExpressionKotlin = exp1
    protected val exp2: ArithmeticExpressionKotlin = exp2

}