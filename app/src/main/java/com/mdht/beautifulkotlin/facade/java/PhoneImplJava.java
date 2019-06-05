package com.mdht.beautifulkotlin.facade.java;

import android.util.Log;

public class PhoneImplJava implements PhoneJava {
    private final String TAG = PhoneImplJava.class.getSimpleName();
    @Override
    public void dail() {
        Log.d(TAG,"打电话");
    }

    @Override
    public void hangup() {
        Log.d(TAG,"挂断");
    }
}
