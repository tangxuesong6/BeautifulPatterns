package com.mdht.beautifulkotlin.chainofresponsibility.java;

import android.util.Log;

public class ManagerJava extends ILeaderJava {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        Log.d("ManagerJava", "经理批复 " + money + "元");
    }
}
