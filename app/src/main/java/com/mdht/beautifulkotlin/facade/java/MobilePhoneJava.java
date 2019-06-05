package com.mdht.beautifulkotlin.facade.java;

import android.util.Log;

public class MobilePhoneJava {
    private final String TAG = MobilePhoneJava.class.getSimpleName();
    private PhoneJava phone = new PhoneImplJava();
    private CameraJava camera = new SamsungCameraJava();

    public void dail() {
        phone.dail();
    }

    public void videoChat() {
        Log.d(TAG, "-->视频聊天接通中");
        camera.open();
        phone.dail();
    }

    public void hangup() {
        phone.hangup();
    }

    public void takePicture() {
        camera.open();
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }
}
