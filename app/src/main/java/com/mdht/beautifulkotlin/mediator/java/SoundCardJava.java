package com.mdht.beautifulkotlin.mediator.java;

import android.util.Log;

public class SoundCardJava extends ColleagueJava {
    private final String TAG = SoundCardJava.class.getSimpleName();

    public SoundCardJava(MediatorJava mediatorJava) {
        super(mediatorJava);
    }

    public void soundPlay(String data) {
        Log.d(TAG, "音频: " + data);
    }
}
