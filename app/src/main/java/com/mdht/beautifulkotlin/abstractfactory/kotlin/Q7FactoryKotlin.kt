package com.mdht.beautifulkotlin.abstractfactory.kotlin

class Q7FactoryKotlin : CarFactoryKotlin() {
    override fun createTire(): ITireKotlin {
        return SUVTireKotlin()
    }
}