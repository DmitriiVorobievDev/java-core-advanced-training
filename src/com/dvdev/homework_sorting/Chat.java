package com.dvdev.homework_sorting;

public class Chat implements Comparable<Chat> {

    private String chatName;
    private int usersCount;

    public Chat(String chatName, int usersCount) {
        this.chatName = chatName;
        this.usersCount = usersCount;
    }

    @Override
    public int compareTo(Chat chat) {
        return Integer.compare(this.getUsersCount(), chat.getUsersCount());
    }

    public String getChatName() {
        return chatName;
    }

    public int getUsersCount() {
        return usersCount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", usersCount=" + usersCount +
                '}';
    }
}
