package com;

public class Main4task3 {
    public static void main(String[] args) {


        Myrepository<User> userrepo = new Myrepository<>();
        userrepo.save(new User("s",10));
        userrepo.save(new User("h",10));
        userrepo.save(new User("m",10));
        userrepo.printAll();
        System.out.println(userrepo.getById(0));


        Myrepository<String> stringrepo = new Myrepository<>();
        stringrepo.save("张三");
        stringrepo.save("王无");
        stringrepo.save("李四");
        System.out.println(stringrepo.getById(0));



        stringrepo.printAll();

        Myrepository<Integer> integerrepo = new Myrepository<>();
        integerrepo.save(8);
        integerrepo.save(0);
        integerrepo.save(9);
        System.out.println(integerrepo.getById(0));

        integerrepo.printAll();

    }
}