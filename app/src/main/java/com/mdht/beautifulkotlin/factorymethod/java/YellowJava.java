package com.mdht.beautifulkotlin.factorymethod.java;

import android.util.Log;
import com.mdht.beautifulkotlin.factorymethod.java.IColorJava;

public class YellowJava implements IColorJava {
    @Override
    public void show() {
        Log.d("YellowJava","YellowJava---> show");
    }
}
