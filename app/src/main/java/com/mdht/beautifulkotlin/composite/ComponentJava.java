package com.mdht.beautifulkotlin.composite;

public abstract class ComponentJava {
    protected String name;

    public ComponentJava(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(ComponentJava componentJava);

    public abstract void removeChild(ComponentJava componentJava);

    public abstract ComponentJava getChildren(int index);
}
