package com;

import java.util.HashMap;

public class Myrepository<T> implements Repository<T> {

    private HashMap<Integer, T> data = new HashMap<>();
    private int nextid = 0;


    @Override
    public void save(T value) {
        this.data.put(nextid, value);
        nextid++;
    }

    @Override
    public T getById(int id) {
        return data.get(id);
    }


    public void printAll() {
        data.values().forEach(value -> System.out.println(value));
    }
}


