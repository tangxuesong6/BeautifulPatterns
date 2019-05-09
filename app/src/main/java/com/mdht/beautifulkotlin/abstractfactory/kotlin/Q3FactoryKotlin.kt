package com.mdht.beautifulkotlin.abstractfactory.kotlin

class Q3FactoryKotlin : CarFactoryKotlin() {
    override fun createTire(): ITireKotlin {
        return NormalTireKotlin()
    }
}