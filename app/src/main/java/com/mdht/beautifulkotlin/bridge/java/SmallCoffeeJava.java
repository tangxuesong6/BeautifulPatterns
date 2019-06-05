package com.mdht.beautifulkotlin.bridge.java;

import android.util.Log;

public class SmallCoffeeJava extends CoffeeJava {
    private final String TAG = SmallCoffeeJava.class.getSimpleName();

    public SmallCoffeeJava(CoffeeAdditivesJava impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "小杯的" + impl.addSomething() + "咖啡");
    }
}
