package com.dvdev.homework_sorting;

import java.util.Comparator;

public class ChatNameComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat c1, Chat c2) {
        return c1.getChatName().compareTo(c2.getChatName());
    }
}
