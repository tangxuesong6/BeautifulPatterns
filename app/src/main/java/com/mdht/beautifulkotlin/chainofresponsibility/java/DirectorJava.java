package com.mdht.beautifulkotlin.chainofresponsibility.java;

import android.util.Log;

public class DirectorJava extends ILeaderJava {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        Log.d("DirectorJava", "主管批复 " + money + "元");
    }
}
