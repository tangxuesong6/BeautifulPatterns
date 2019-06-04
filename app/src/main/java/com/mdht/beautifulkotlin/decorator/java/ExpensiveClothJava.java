package com.mdht.beautifulkotlin.decorator.java;

import android.util.Log;

public class ExpensiveClothJava extends PersonClothJava {
    private final String TAG = ExpensiveClothJava.class.getSimpleName();

    public ExpensiveClothJava(PersonJava personJava) {
        super(personJava);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }

    private void dressJean() {
        Log.d(TAG, "穿件牛仔裤");
    }

    private void dressLeather() {
        Log.d(TAG, "穿件皮衣");
    }

    private void dressShirt() {
        Log.d(TAG, "穿件短袖");
    }
}
