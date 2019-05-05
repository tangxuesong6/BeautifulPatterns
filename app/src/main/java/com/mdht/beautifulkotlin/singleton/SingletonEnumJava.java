package com.mdht.beautifulkotlin.singleton;

import android.util.Log;

public enum SingletonEnumJava {
    INSTANCE;
    public void doSomething(){
        Log.d("SingletonEnumJava","java 单例方法");
    }
}
