package com.Example;

public class Retangle extends shape{
    double length,width;

    public Retangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
