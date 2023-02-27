package com.dvdev.reflection_api.practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * 1. Создать класс Car с полями String brand и String model.
 * Создать аннотации @Table (принимает название схемы и таблицы
 * в базе данных) и @Column (принимает название колонки в таблице
 * базы данных). Пометить класс аннотацией @Table и поля
 * аннотацией @Column. Написать программу, принимающую
 * объект класс  Car c проинициализированными полями и
 * составляющую запрос "INSERT" в виде строки на основании
 * данных объекта.
 * Пример: дан объект Car car = new Car("Toyota", "Corolla");
 * Программа, принимающая этот объект, должна вывести в консоль строку:
 * "INSERT INTO garage.car (model, brand) VALUES ('Toyota', 'Corolla');"
 */

public class CarRunner {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        System.out.println(car);
        System.out.println(generateInsert(car));
    }

    private static String generateInsert(Car car) {
        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";
        Table table = car.getClass().getAnnotation(Table.class); //получаем объект аннотации
        Field[] fields = car.getClass().getDeclaredFields();

        //получаем названия полей
        String fieldNames = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> field.getAnnotation(Column.class))
                .map(Column::name)
                .collect(Collectors.joining(", "));

        //получаем значения полей
        String fieldValues = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class)) //проверяем наличие аннотации над полем
                .sorted(Comparator.comparing(Field::getName)) //сортируем по имени
                .map(field -> getMethodName(car, field))//преобразуем поле в имя его метода-геттера
                .map(method -> {
                    try {
                        return method.invoke(car); //вызываем метод-геттер по его полученному имени
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(", "));
        return String.format(template, table.schema(), table.name(), fieldNames, fieldValues);
    }

    private static Method getMethodName(Car car, Field field) {
        String name = field.getName();
        try {
            return car.getClass().getMethod("get" + name.substring(0, 1).toUpperCase() + name.substring(1));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
