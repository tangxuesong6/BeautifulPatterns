package com.mdht.beautifulkotlin.bridge.java;

import android.util.Log;

public class LargeCoffeeJava extends CoffeeJava {
    private final String TAG = LargeCoffeeJava.class.getSimpleName();

    public LargeCoffeeJava(CoffeeAdditivesJava impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "大杯的" + impl.addSomething() + "咖啡");
    }
}
