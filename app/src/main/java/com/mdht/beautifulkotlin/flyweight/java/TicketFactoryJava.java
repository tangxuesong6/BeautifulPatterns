package com.mdht.beautifulkotlin.flyweight.java;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class TicketFactoryJava {
    private static final String TAG = TicketFactoryJava.class.getSimpleName();
    static Map<String, TicketJava> stringTicketJavaMap = new HashMap<>();

    public static TicketJava getTicket(String from, String to) {
        String key = from + "-" + to;
        if (stringTicketJavaMap.containsKey(key)) {
            Log.d(TAG, "使用缓存 ==>" + key);
            return stringTicketJavaMap.get(key);
        } else {
            Log.d(TAG, "创建对象 ==>" + key);
            TicketJava ticketJava = new TrainTicketJava(from, to);
            stringTicketJavaMap.put(key, ticketJava);
            return ticketJava;
        }
    }
}
