package com.mdht.beautifulkotlin.composite;

import android.util.Log;

public class LeafJava extends ComponentJava {
    private final String TAG = LeafJava.class.getSimpleName();

    public LeafJava(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d(TAG, name);
    }

    @Override
    public void addChild(ComponentJava componentJava) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }

    @Override
    public void removeChild(ComponentJava componentJava) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }

    @Override
    public ComponentJava getChildren(int index) {
        throw new UnsupportedOperationException("叶子节点没有子节点");
    }
}
