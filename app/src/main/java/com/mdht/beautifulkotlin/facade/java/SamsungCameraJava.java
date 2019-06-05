package com.mdht.beautifulkotlin.facade.java;

import android.util.Log;

public class SamsungCameraJava implements CameraJava {
    private final String TAG = SamsungCameraJava.class.getSimpleName();

    @Override
    public void open() {
        Log.d(TAG, "打开相机");
    }

    @Override
    public void takePicture() {
        Log.d(TAG, "拍照");
    }

    @Override
    public void close() {
        Log.d(TAG, "关闭相机");
    }
}
