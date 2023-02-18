package com.dvdev.oop1;


public class Comp {

    private Ssd ssd;
    private Ram ram;

    public Comp(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("I have loaded");
    }
}