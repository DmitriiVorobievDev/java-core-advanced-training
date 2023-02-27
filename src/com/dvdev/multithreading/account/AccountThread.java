package com.dvdev.multithreading.account;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /**
     * 1 ------- account1 -> account2
     * <p>
     * 2 ------- account2 -> account1
     */

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try { //в try выполняем код
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            } finally { //в finally отпускаем мониторы
                accountFrom.getLock().unlock();
                accountTo.getLock().unlock();
            }
        }
    }

    private void lockAccounts() { //метод лочит оба монитора
        while(true) {
            boolean fromLockResult = accountFrom.getLock().tryLock(); //пытаемся захватить лок accountFrom
            boolean toLockResult = accountTo.getLock().tryLock(); //пытаемся захватить лок у accountTo
            if(fromLockResult && toLockResult) {
                break; //если захвачены оба монитора, то выходим из цикла
            }
            //если хоть один из мониторов не удалось захватить, то нужно отпустить
            //оба монитора, чтобы избежать дедлока
            if(fromLockResult) {
                accountFrom.getLock().unlock();
            }
            if(toLockResult) {
                accountTo.getLock().unlock();
            }
        }
    }
}


