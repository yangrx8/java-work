package com.Example;

public class Main3task4 {
    public static void main(String[] args) {
        shape t = new Triangle(3, 4, 5);
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
        shape c = new Circle(4);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        shape r = new Retangle(3,4);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
