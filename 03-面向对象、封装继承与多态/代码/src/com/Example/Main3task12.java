package com.Example;


public class Main3task12 {
    public static void main(String[] args) {
      Person p = new Person("小明",18,"男");
      Person p1 = new Person(p);
      System.out.println(p1);
      System.out.println(Person.getcount());
    }
}
