package com;

import java.util.ArrayList;
import java.util.List;

public class Main4task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for ( Integer num : list) {
            System.out.println(num);
        }
        //确实方便很多
        for(int i = 0;i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
