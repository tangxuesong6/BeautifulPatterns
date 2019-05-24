package com.mdht.beautifulkotlin.memento.java;

public class OriginatorJava {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MementoJava createMemento() {
        MementoJava mementoJava = new MementoJava();
        mementoJava.setState(state);
        return mementoJava;
    }

    public void restore(MementoJava mementoJava) {
        state = mementoJava.getState();
    }
}
