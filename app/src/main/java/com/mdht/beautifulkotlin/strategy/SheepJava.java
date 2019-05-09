package com.mdht.beautifulkotlin.strategy;

import android.util.Log;

public class SheepJava implements EatStrategyJava {
    @Override
    public void eat() {
        Log.d("SheepJava", "Sheep 吃青草 ");
    }
}
