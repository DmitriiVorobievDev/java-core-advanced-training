package com.dvdev.oop2.example1;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
//        laptop.load();
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
//        mobile.load();

        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);


//        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for(Computer computer : computers) {
            computer.print();
            if(computer instanceof Laptop) { //проверяем, ведет ли ссылка computer на объект класса Laptop
                ((Laptop)computer).open(); //приводим ссылку computer к типу Laptop, чтобы юзать функционал Laptop
            }
        }
    }

    public static void loadComputers(Computer... computers) {
        for(Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
