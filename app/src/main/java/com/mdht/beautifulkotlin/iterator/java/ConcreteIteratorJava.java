package com.mdht.beautifulkotlin.iterator.java;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIteratorJava<T> implements IteratorJava<T> {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIteratorJava(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
