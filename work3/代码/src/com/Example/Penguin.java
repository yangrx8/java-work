package com.Example;

public class Penguin extends Animal {
    public Penguin() {
        super("Penguin", 2);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}