package com.dvdev.constructors;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumInterval = timeInterval.sum(timeInterval2);
        sumInterval.print();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 0);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
