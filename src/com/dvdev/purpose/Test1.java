package com.dvdev.purpose;

public class Test1 {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper(30, 10, 10000);
        System.out.println(skyscraper.earnMoney());
    }
}

class Skyscraper {

    private int n;
    private int m;
    private int x;

    public Skyscraper(int n, int m, int x) {
        this.n = n;
        this.m = m;
        this.x = x;
    }

    public int earnMoney() {
        int tempPrice = this.x;
        int allMoneyCount = 0;
        int compareCount = this.m;
        for (int i = 1; i <= n; i++) {
            if (i <= compareCount) {
                allMoneyCount += tempPrice;
            } else {
                compareCount += this.m;
                tempPrice += 1000;
                allMoneyCount += tempPrice;
                continue;
            }
        }
        return allMoneyCount;
    }
}
