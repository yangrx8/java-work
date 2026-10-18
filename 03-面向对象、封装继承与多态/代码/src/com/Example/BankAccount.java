package com.Example;

public class BankAccount {
    private double balance;
    private String password;
    private String accountNumber;
    private String accountHolder;

    BankAccount(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.password = password;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            System.out.println("存钱成功");
            balance = balance + amount;
        }
    }

    boolean withdraw(double amount, String inputPassword) {
        if (!password.equals(inputPassword)){
            System.out.println("密码错误");
            return false;
        }
        if (amount <= 0 || amount > balance) {
            System.out.println("余额不足");
            return false;
        }
        this.balance -= amount;
        System.out.println("取钱成功");
        return true;
    }

    boolean transfer(BankAccount recipient, double amount, String inputPassword) {
        if (recipient == null) {
            System.out.println("用户不存在");
            return false;
        }
        if (!password.equals(inputPassword)){
            System.out.println("密码错误");
            return false;
        }
        if (amount <= 0 || amount > balance) {
            System.out.println("余额不足");
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        System.out.println("转账成功");
        return true;
    }

    double getBalance() {
        return balance;
    }

    String getAccountInfo() {
        return "持有人：" + accountHolder + " " + "银行账号:" + accountNumber;
    }

    // 只需修改可见性
    private boolean validatePassword(String inputPassword) {
        return true;
    }

    // 只需修改可见性
    private boolean validateAmount(double amount) {
        return true;
    }
}
