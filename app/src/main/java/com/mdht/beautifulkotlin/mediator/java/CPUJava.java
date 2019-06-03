package com.mdht.beautifulkotlin.mediator.java;

public class CPUJava extends ColleagueJava {
    private String dataVideo;
    private String dataSound;

    public CPUJava(MediatorJava mediatorJava) {
        super(mediatorJava);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data) {
        String[] tmp = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];
        mediatorJava.changed(this);
    }

}
