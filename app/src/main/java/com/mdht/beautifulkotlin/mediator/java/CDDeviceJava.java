package com.mdht.beautifulkotlin.mediator.java;

public class CDDeviceJava extends ColleagueJava {
    private String data;

    public CDDeviceJava(MediatorJava mediatorJava) {
        super(mediatorJava);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据,音频数据";
        mediatorJava.changed(this);
    }

}
