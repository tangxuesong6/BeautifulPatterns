package com.mdht.beautifulkotlin.flyweight.java;

import android.util.Log;

import java.util.Random;

public class TrainTicketJava implements TicketJava {
    private final String TAG = TrainTicketJava.class.getSimpleName();
    public String from;
    public String to;
    public int price;

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        Log.d(TAG, "购买 从" + from + "到 " + to + "的 " + bunk + "火车票，价格" + price);
    }

    public TrainTicketJava(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
