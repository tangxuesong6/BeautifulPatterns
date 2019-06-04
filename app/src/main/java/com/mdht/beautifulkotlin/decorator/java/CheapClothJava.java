package com.mdht.beautifulkotlin.decorator.java;

import android.util.Log;

public class CheapClothJava extends PersonClothJava {
    private final String TAG = CheapClothJava.class.getSimpleName();

    public CheapClothJava(PersonJava personJava) {
        super(personJava);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }

    private void dressShorts() {
        Log.d(TAG, "穿条短裤");
    }
}
