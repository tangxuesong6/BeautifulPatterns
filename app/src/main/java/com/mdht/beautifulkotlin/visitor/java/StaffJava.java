package com.mdht.beautifulkotlin.visitor.java;

import java.util.Random;

public abstract class StaffJava {
    public String name;
    public int kpi;

    public StaffJava(String aName) {
        name = aName;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(VisitorJava visitorJava);
}
