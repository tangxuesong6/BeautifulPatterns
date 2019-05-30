package com.mdht.beautifulkotlin.visitor.java;

import java.util.Random;

public class EngineerJava extends StaffJava {
    public EngineerJava(String aName) {
        super(aName);
    }

    @Override
    public void accept(VisitorJava visitorJava) {
        visitorJava.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
