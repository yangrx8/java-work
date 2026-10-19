package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Main4task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        Consumer<Integer> c = n -> System.out.println(n);
        list.forEach(c);
        //实现函数式接口中抽象方法的实现，感觉像是创建对象又重写了方法
        list.forEach(n -> System.out.println(n));
    }
}
