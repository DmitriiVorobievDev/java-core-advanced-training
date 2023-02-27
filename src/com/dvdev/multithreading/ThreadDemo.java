package com.dvdev.multithreading;

public class ThreadDemo {

    public static void main(String[] args) {

        //create our threads
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState()); //state ==NEW
        var runnableThread = new Thread(new SimpleRunnable(), "My Name");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));

        //launch our threads
        simpleThread.start();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState()); //state == RUNNABLE

        runnableThread.start();
        lambdaThread.start();


        try {
            simpleThread.join(); //поток main будет ждать, пока не выполнится поток
            runnableThread.join();
            System.out.println(simpleThread.getName() + " : " + simpleThread.getState()); //state == TERMINATED
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
