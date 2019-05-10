package com.mdht.beautifulkotlin.chainofresponsibility.java;

import android.util.Log;

public class BossJava extends ILeaderJava {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        Log.d("BossJava", "老板批复 " + money + "元");
    }
}
