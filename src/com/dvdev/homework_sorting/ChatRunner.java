package com.dvdev.homework_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRunner {

    public static void main(String[] args) {
        List<Chat> list = new ArrayList<>();

        Chat c1 = new Chat("Viber", 1500);
        Chat c2 = new Chat("WhatsApp", 2500);
        Chat c3 = new Chat("Telegram", 3500);
        Chat c4 = new Chat("WeChat", 900);
        Chat c5 = new Chat("PopaChat", 3);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        list = deleteLessThan1000(list);
        System.out.println(list);

        System.out.println("--------------------------------");

        Collections.sort(list, new ChatCountUpComparator());
        System.out.println(list);

        System.out.println("--------------------------------");

        Collections.sort(list, new ChatCountDownComparator());
        System.out.println(list);

        System.out.println("--------------------------------");

        Collections.sort(list, new ChatNameComparator());
        System.out.println(list);
    }

    public static List<Chat> deleteLessThan1000(List<Chat> list) {
        List<Chat> tempList = new ArrayList<>();
        for (Chat chat : list) {
            if (chat.getUsersCount() < 1000) {
                continue;
            } else {
                tempList.add(chat);
            }
        }
        return tempList;
    }
}
