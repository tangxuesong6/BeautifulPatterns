package com.mdht.beautifulkotlin.singleton;

import android.util.Log;

public class SingletonInnerJava {
    private SingletonInnerJava() {
    }

    public static SingletonInnerJava getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final SingletonInnerJava sInstance = new SingletonInnerJava();
    }

    public void doSomething() {
        Log.d("SingletonInnerJava", "java 单例方法");
    }

}
