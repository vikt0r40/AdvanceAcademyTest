package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User("Viktor", "Todorov","aaa@aa.bg","1234");
        Ad ad = new Ad("iPhone XS 64GB", "2000", user);


        System.out.println(ad);
        System.out.println("dasdsa");
    }
}
