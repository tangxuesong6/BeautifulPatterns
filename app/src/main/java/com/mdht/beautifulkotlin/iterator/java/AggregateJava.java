package com.mdht.beautifulkotlin.iterator.java;

public interface AggregateJava<T> {
    void add(T obj);

    void remove(T obj);

    IteratorJava<T> iterator();
}
