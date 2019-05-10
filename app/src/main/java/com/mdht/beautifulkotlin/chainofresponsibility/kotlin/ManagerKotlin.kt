package com.mdht.beautifulkotlin.chainofresponsibility.kotlin

import android.util.Log

class ManagerKotlin : ILeaderKotlin() {
    override fun limit(): Int {
        return 10000

    }

    override fun handle(money: Int) {
        Log.d("ManagerKotlin", "经理批复 " + money + "元")
    }
}