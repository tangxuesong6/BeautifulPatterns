package com.mdht.beautifulkotlin.chainofresponsibility.java;

import android.util.Log;

public class GroupLeaderJava extends ILeaderJava {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        Log.d("GroupLeaderJava", "组长批复 " + money + "元");
    }
}
