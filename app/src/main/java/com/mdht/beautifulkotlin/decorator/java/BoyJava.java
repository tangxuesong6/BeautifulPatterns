package com.mdht.beautifulkotlin.decorator.java;

import android.util.Log;

public class BoyJava extends PersonJava {
    private final String TAG = BoyJava.class.getSimpleName();

    @Override
    public void dressed() {
        Log.d(TAG, "穿了内衣内裤");
    }
}
