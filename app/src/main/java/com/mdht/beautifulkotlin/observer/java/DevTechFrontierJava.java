package com.mdht.beautifulkotlin.observer.java;

import java.util.Observable;

public class DevTechFrontierJava extends Observable {
    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }
}
