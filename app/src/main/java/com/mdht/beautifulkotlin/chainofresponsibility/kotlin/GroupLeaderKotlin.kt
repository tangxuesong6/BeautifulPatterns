package com.mdht.beautifulkotlin.chainofresponsibility.kotlin

import android.util.Log

class GroupLeaderKotlin : ILeaderKotlin() {
    override fun limit(): Int {
        return 1000
    }

    override fun handle(money: Int) {
        Log.d("GroupLeaderKotlin", "组长批复 " + money + "元")
    }
}