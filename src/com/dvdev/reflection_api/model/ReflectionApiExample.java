package com.dvdev.reflection_api.model;

import java.lang.reflect.*;

public class ReflectionApiExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25L, "Ivan", 24);
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1);
        testMethods(user);
        testConstructor();
        testFields(user);
    }

    //создание и использование конструктора через Reflection API
    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

    //получаем филды класса через Reflection API
    //получаем поле как Field - объект класса Field
    private static void testFields(Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true); //делаем доступными private поля
            Object value = declaredField.get(object); //получаем значение переменной name
            System.out.println(declaredField.getModifiers()); //получаем модификаторы доступа
            //для определения модификаторов используется побитовая маска 1 или 2 байта:
            // [0, 0, 0, 0, 0, 0, 0, 1] - public
            // [0, 0, 0, 0, 0, 0, 1, 1] - private
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(value);
        }
    }

    //получить/вызвать методы класса через Reflection API
    //получаем метод как Method - объект класса Method
    public static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Sveta"); //вызываем метод user.setName();
        System.out.println(user);
    }

    private class Test1 {

    }

    private static class Test3 {

    }

    private enum Test2 {
        ONE, TWO,
    }
}
