package com.mdht.beautifulkotlin.iterator.java;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateJava<T> implements AggregateJava<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public IteratorJava<T> iterator() {
        return new ConcreteIteratorJava<T>(list);
    }
}
