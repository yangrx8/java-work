package com.Example;

public class Mouse extends Animal{
    public Mouse(){
        super("Mouse",1);
    }

    @Override
    public void eat() {
        System.out.println("偷吃粮食");
    }
}
