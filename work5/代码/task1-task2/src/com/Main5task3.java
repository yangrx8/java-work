package com;

import java.io.*;

public class Main5task3 {
    public static void main(String[] args) {
        Student student = new Student(1, "doro", 2, "114514");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"))){
            out.writeObject(student);
        } catch (IOException e) {
        throw new RuntimeException(e);
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student s = (Student) in.readObject();
            System.out.println(s);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
