package com.dvdev.homework_sorting;

import java.util.Comparator;

public class ChatCountUpComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat c1, Chat c2) {
        return Integer.compare(c1.getUsersCount(), c2.getUsersCount());
    }
}
