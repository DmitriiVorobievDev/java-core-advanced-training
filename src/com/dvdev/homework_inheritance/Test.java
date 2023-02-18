package com.dvdev.homework_inheritance;

public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(true);
        Room room3 = new Room(false);
        Room room4 = new Room(false);
        Room room5 = new Room(true);
        Room[] rooms1 = {room1, room2};
        Room[] rooms2 = {room3, room4};
        Room[] rooms3 = {room4};
        room1.print();

        Apartment apartment1 = new Apartment(1, rooms1);
        Apartment apartment2 = new Apartment(2, rooms2);
        Apartment apartment3 = new Apartment(3, rooms3);
        Apartment[] apartments = {apartment1, apartment2, apartment3};
        apartment1.print();

        Floor floor1 = new Floor(1, apartments);
        Floor[] floors = {floor1};
        floor1.print();

        House house = new House(1, floors);
        house.print();

        System.out.println("-------------------------");
        Test.printAllInformation(house);


    }
    public static void printAllInformation(House house) {
        house.print();

        for (int i = 0; i < house.getFloors().length; i++) {
            house.getFloors()[i].print(); //выводим этажи дома

            for (int j = 0; j < house.getFloors()[i].getApartments().length; j++) {
                house.getFloors()[i].getApartments()[j].print(); //выводим квартиры этажа

                for (int k = 0; k < house.getFloors()[i].getApartments()[j].getRooms().length; k++) {
                    house.getFloors()[i].getApartments()[j].getRooms()[k].print(); //выводим комнаты квартиры
                }
            }
        }
    }
}
