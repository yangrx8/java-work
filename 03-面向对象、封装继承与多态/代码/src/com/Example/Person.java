package com.Example;

public class Person{
    public String name;
    public int age;
    public String gender;
    private static int n = 0;



    public Person(String name,int age,String gender) {
        this.name = name;
        this.age =age;
        this.gender = gender;
        n++;
    }

    public Person(Person p){
        name = p.name;
        age = p.age;
        gender = p.gender;
        n++;
    }

    public static int getcount() {
        return n;
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

