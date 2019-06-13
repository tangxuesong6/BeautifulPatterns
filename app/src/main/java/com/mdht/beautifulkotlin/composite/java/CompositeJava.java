package com.mdht.beautifulkotlin.composite.java;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CompositeJava extends ComponentJava {
    private final String TAG = CompositeJava.class.getSimpleName();
    private List<ComponentJava> components = new ArrayList<>();

    public CompositeJava(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d(TAG, name);
        if (components != null && components.size() > 0) {
            for (ComponentJava componentJava : components) {
                componentJava.doSomething();
            }
        }
    }

    @Override
    public void addChild(ComponentJava componentJava) {
        components.add(componentJava);
    }

    @Override
    public void removeChild(ComponentJava componentJava) {
        components.remove(componentJava);
    }

    @Override
    public ComponentJava getChildren(int index) {
        return components.get(index);
    }
}
