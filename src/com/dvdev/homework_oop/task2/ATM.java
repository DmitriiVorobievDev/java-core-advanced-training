package com.dvdev.homework_oop.task2;

public class ATM {

    private int cash20;
    private int cash50;
    private int cash100;
    private int totalMoneyAtm;

    public ATM(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
        this.totalMoneyAtm = cash20 * 20 + cash50 * 50 + cash100 * 100;
    }

    public int getTotalMoneyAtm() {
        return totalMoneyAtm;
    }

    public int getCash20() {
        return cash20;
    }

    public int getCash50() {
        return cash50;
    }

    public int getCash100() {
        return cash100;
    }

    public void setTotalMoneyAtm(int totalMoneyAtm) {
        this.totalMoneyAtm = totalMoneyAtm;
    }

    public void setCash20(int cash20) {
        this.cash20 = cash20;
    }

    public void setCash50(int cash50) {
        this.cash50 = cash50;
    }

    public void setCash100(int cash100) {
        this.cash100 = cash100;
    }

    public void addMoney(int cash20, int cash50, int cash100) {
        int temp20 = this.getCash20();
        int temp50 = this.getCash50();
        int temp100 = this.getCash100();

        this.setCash20(temp20 + cash20);
        this.setCash50(temp50 + cash50);
        this.setCash100(temp100 + cash100);
        this.setTotalMoneyAtm(this.getTotalMoneyAtm() + this.getCash100()*100 + this.getCash50()*50 + this.getCash20()*20);

        System.out.println("20$: " + this.getCash20() + ", 50$: " + this.getCash50() +
                ", 100$: " + this.getCash100());
    }

    public boolean getMoney(int amount) {
        boolean operationSuccess;
        int tempAmount = 0;
        int got100 = 0;
        int got50 = 0;
        int got20 = 0;
        if (this.getTotalMoneyAtm() < amount) {
            System.out.println("Operation failed");
            System.out.println("Not enough money in ATM");
            return false;
        } else if (this.getTotalMoneyAtm() >= amount) {
            tempAmount = amount;
            while (this.cash100 > 0 && tempAmount >= 100) { //нет 100-ок или сумма меньше 100
                tempAmount -= 100;
                this.cash100--;
                got100++;
            }

            while (this.cash50 > 0 && tempAmount >= 50) {
                tempAmount -= 50;
                this.cash50--;
                got50++;
            }
            while (this.cash20 > 0 && tempAmount >= 20) {
                tempAmount -= 20;
                this.cash20--;
                got20++;
            }

        }
        if (tempAmount == 0) {
            operationSuccess = true;
            System.out.println("Operation success");
            System.out.println("You get: ");
            System.out.println("100$: " + got100);
            System.out.println("50$: " + got50);
            System.out.println("20$: " + got20);
        } else {
            operationSuccess = false;
        }
        return operationSuccess;
    }
}
