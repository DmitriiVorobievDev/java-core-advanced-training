package com.dvdev.multithreading.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashboxes;

    public BuyerThread(Queue<CashBox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        //покупателю получить доступ к кассе -
        //поток должен захватить монитор одной кассы (одного объекта CashBox)
        try {

            synchronized (cashboxes) { //захватываем монитор всех касс
                while (true) {
                    //теперь только один поток проверяет есть ли свободная касса и удаляет/затем добавляет ее

                    if (!cashboxes.isEmpty()) {
                        CashBox cashbox = cashboxes.remove(); //здесь м.б. NoSuchElementException - 2 потока могут сделать remove
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);

                        cashboxes.wait(5L); //поток засыпает на 5мс
                        //освобождаем монитор cashboxes для других потоков

                        System.out.println(Thread.currentThread().getName() + " обслуживает кассу " + cashbox);
                        cashboxes.add(cashbox); //после того, как освободили кассу, нужно уведомить ждущие потоки
                        cashboxes.notify();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
                        cashboxes.wait(); //не указываем время,т.к. неизвестно сколько ждать своб кассу
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
