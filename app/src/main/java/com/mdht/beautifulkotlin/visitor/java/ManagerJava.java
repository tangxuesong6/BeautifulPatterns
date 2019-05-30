package com.mdht.beautifulkotlin.visitor.java;

import java.util.Random;

public class ManagerJava extends StaffJava {
    private int products;

    public ManagerJava(String aName) {
        super(aName);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(VisitorJava visitorJava) {
        visitorJava.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
