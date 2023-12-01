package com.designPatterns.builder;


public class Phone {
    private String os;
    private String ram;
    private int processor;
    private String screenSize;
    private int battery;

    public Phone(String os, String ram, int processor, String screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public Phone() {
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", processor=" + processor +
                ", screenSize='" + screenSize + '\'' +
                ", battery=" + battery +
                '}';
    }
}
