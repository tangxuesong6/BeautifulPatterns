package com.mdht.beautifulkotlin.adapter.java;

public class VoltAdapterJava implements FiveVoltJava {
    private Volt220Java volt220Java;

    public VoltAdapterJava(Volt220Java volt220Java) {
        this.volt220Java = volt220Java;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    public int getVolt220Java() {
        return volt220Java.getVolt220();
    }
}
