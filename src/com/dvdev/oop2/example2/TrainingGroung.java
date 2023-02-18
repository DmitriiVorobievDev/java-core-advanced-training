package com.dvdev.oop2.example2;

public class TrainingGroung {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Boromir", 15);
        Hero mage = new Mage("Gendalf", 20);
        Hero archer = new Archer("Legolas", 10);

        Enemy enemy = new Enemy("Zombie", 100);

        attackEnemy(enemy, warrior, mage, archer);


    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while(enemy.isAlive()) {
            for (Hero hero : heroes) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
