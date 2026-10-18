package com.Example;

public class Circle extends shape{
    double radius;
    double area;
    double perimeter;

    public Circle(double radius){
        this.radius = radius;
    }


    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }

    public double getPerimeter(){
        perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

}
