package com.dvdev.oop2.example1;

public class CompositionRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
//        Computer computer = new Computer(ram, ssd);
//        computer.printState();

//        Laptop laptop = new Laptop(new Ram(512), new Ssd(250), 2);
//        laptop.open();
//        laptop.printState();
    }
}
