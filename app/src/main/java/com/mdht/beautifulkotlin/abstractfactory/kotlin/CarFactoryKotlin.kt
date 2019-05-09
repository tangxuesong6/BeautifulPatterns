package com.mdht.beautifulkotlin.abstractfactory.kotlin

abstract class CarFactoryKotlin {
    abstract fun createTire(): ITireKotlin
    companion object{
        fun createFactory(enumFactoryKotlin: EnumFactoryKotlin): CarFactoryKotlin {
            return when (enumFactoryKotlin) {
                EnumFactoryKotlin.Q3 -> Q3FactoryKotlin()
                EnumFactoryKotlin.Q7 -> Q7FactoryKotlin()
            }
        }
    }
}