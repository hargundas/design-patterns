package com.designPatterns.builder;

public class PhoneBuilder {

    private String os;
    private String ram;
    private int processor;
    private String screenSize;
    private int battery;


    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;}

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;}

    public PhoneBuilder setProcessor(int processor) {
        this.processor = processor;
        return this; }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,ram,processor,screenSize,battery);
    }
}
