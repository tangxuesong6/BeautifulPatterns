package com.mdht.beautifulkotlin.abstractfactory.java;

import android.util.Log;

public class NormalTireJava implements ITireJava {
    @Override
    public void tire() {
        Log.d("NormalTireJava", "普通轮胎");
    }
}
