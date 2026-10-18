package com.Example;

public class Main3task3 {
    public static void main(String[] args) {
        Animal a = new Animal("A", 1);
        Animal m = new Mouse();
        Animal p = new Penguin();
        a.eat();
        m.eat();
        p.eat();
        System.out.println(p.getname());
    }
}
