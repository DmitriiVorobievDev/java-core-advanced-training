package com.dvdev.oop2.example2;

import com.dvdev.oop2.example3.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
