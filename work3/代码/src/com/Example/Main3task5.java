package com.Example;

public class Main3task5 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("1", "小明", 1000, "123456");
        BankAccount b = new BankAccount("2", "小红", 500, "654321");


        System.out.println(a.transfer(b,200,"123456"));

        System.out.println(a.getBalance());
        System.out.println(b.getBalance());

        a.deposit(200);
        System.out.println(a.getBalance());

        a.withdraw(400,"123456");
        System.out.println(a.getBalance());

        b.withdraw(1000,"65432");
        System.out.println(b.getBalance());

        System.out.println(a.transfer(null,200,"123456"));
        System.out.println(a.getBalance());

    }
}
