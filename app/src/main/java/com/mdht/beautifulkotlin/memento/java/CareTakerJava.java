package com.mdht.beautifulkotlin.memento.java;

import java.util.ArrayList;
import java.util.List;

public class CareTakerJava {
    private final List<MementoJava> mementoJavaList = new ArrayList<>();

    public void saveState(MementoJava state) {
        mementoJavaList.add(state);
    }

    public MementoJava restore(int index) {
        return mementoJavaList.get(index);
    }
}
