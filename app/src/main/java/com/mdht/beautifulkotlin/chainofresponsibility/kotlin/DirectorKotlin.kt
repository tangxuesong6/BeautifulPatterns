package com.mdht.beautifulkotlin.chainofresponsibility.kotlin

import android.util.Log

class DirectorKotlin : ILeaderKotlin() {
    override fun limit(): Int {
        return 5000
    }

    override fun handle(money: Int) {
        Log.d("DirectorKotlin", "主管批复 " + money + "元")
    }
}