package com.dvdev.oop1;

public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(500);
        Comp comp = new Comp(ssd, ram);
        comp.load();

    }
}
