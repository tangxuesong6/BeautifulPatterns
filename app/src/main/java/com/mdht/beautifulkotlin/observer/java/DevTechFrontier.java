package com.mdht.beautifulkotlin.observer.java;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }
}
