package com.mdht.beautifulkotlin.strategy.kotlin

class EatManagerKotlin(private val eatStrategy: (String) -> String) {
    fun eat(string: String): String {
        return eatStrategy(string)
    }
}