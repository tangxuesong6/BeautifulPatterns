package com.mdht.beautifulkotlin.strategy;

import android.util.Log;

public class DogJava implements EatStrategyJava {
    @Override
    public void eat() {
        Log.d("DogJava", "Dog 吃 狗粮");
    }
}
