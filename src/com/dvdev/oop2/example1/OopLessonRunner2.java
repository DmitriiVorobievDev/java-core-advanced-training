package com.dvdev.oop2.example1;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        printWithRandom(laptop, mobile);
    }

       public static void printWithRandom(Printable... objects) {
           for (Printable object : objects) {
               object.printWithRandom();
               System.out.println();
           }
    }
}
