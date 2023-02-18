package com.dvdev.oop2.example1;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("I switched on");
    }

    @Override
    public void print() {
        super.print();
    }

    public void open() {
        System.out.println("Open the cover");
    }

    public int getWeight() {
        return weight;
    }

}
