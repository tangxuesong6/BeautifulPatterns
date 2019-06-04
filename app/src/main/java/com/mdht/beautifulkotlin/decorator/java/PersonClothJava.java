package com.mdht.beautifulkotlin.decorator.java;

public abstract class PersonClothJava extends PersonJava {
    protected PersonJava personJava;

    public PersonClothJava(PersonJava personJava) {
        this.personJava = personJava;
    }

    @Override
    public void dressed() {
        personJava.dressed();
    }
}
