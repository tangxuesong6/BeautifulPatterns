package com.mdht.beautifulkotlin.chainofresponsibility.kotlin

import android.util.Log

class BossKotlin : ILeaderKotlin() {
    override fun limit(): Int {
        return Integer.MAX_VALUE
    }

    override fun handle(money: Int) {
        Log.d("BossKotlin", "老板批复 " + money + "元")
    }
}