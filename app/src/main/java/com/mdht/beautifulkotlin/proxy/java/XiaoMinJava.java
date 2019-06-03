package com.mdht.beautifulkotlin.proxy.java;

import android.util.Log;

import java.lang.reflect.Proxy;

public class XiaoMinJava implements ILawsuitJava {
    private final String TAG = XiaoMinJava.class.getSimpleName();

    @Override
    public void submit() {
        Log.d(TAG, "谷歌拖欠工资！特此申请仲裁！ ");
    }

    @Override
    public void burden() {
        Log.d(TAG, "这是合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        Log.d(TAG, "证据确凿，不需要再说什么了！");
    }

    @Override
    public void finish() {
        Log.d(TAG, "诉讼成功，判决谷歌赔钱！");
    }
}
