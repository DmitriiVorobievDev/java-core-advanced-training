package com.dvdev.oop2.example1;

public abstract class Computer implements Printable {
    private Ram ram;
    private Ssd ssd;

    public abstract void load();

    @Override
    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + " ram: " + ram.getValue());
    }

    public static int getCounter() {
        return counter;
    }

    public static int counter = 0;

    public Computer(Ssd ssd, Ram ram) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

//    public void printState() {
//        System.out.println("Computer: ram " + ram.getValue()
//        + ", ssd " + ssd.getValue());
//    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
