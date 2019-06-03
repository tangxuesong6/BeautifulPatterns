package com.mdht.beautifulkotlin.proxy.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.proxy.kotlin
 */
class LawyerKotlin(val lawsuit: ILawsuitKotlin) : ILawsuitKotlin {
    override fun submit() {
        lawsuit.submit()
    }

    override fun burden() {
        lawsuit.burden()
    }

    override fun defend() {
        lawsuit.defend()
    }

    override fun finish() {
        lawsuit.finish()
    }
}