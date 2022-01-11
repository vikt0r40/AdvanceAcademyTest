package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User("Viktor Todorov","aaa@aa.bg","1234");
        User user2 = new User("Filip Jordanov","bbbb@aa.bg","123456789");
        User user3 = new User("Hyusein Hyusein", "vvvv@vvv.bg", "696969");
        Ad ad = new Ad("iPhone XS 64GB", "2000", user);
        Ad newAd = new Ad("Redmi Note 10 5G", "500", user);


        System.out.println(ad);
        System.out.println("asasdasdfas");

        
        System.out.println("2");
        System.out.println("3");
    }
}
