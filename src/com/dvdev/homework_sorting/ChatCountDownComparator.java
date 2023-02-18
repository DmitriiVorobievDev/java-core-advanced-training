package com.dvdev.homework_sorting;

import java.util.Comparator;

public class ChatCountDownComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat c1, Chat c2) {
        return Integer.compare(c2.getUsersCount(), c1.getUsersCount());
    }

}
