package com.dvdev.concurrent.pool;

import java.util.Optional;
import java.util.Queue;

public class PoolThread extends Thread {

    private final Queue<Runnable> tasks; //набор задач

    public PoolThread(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(true) {
            Optional<Runnable> task = Optional.empty();
            synchronized (task) {
                if(!task.isEmpty()) { //только 1 поток м. забрать задачу, чтобы несколько потоков не забрали одну и ту же задачу
                    task = Optional.of(tasks.remove());
                }
            }
            task.ifPresent(Runnable::run); //если задача существует, вызываем метод run у нее
        }
    }
}
