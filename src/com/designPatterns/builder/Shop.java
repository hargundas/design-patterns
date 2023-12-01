package com.designPatterns.builder;

public class Shop {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setBattery(3000).setRam("8").getPhone();
        System.out.println(phone);
    }
}
