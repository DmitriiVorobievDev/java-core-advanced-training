package com.dvdev.oop2.example2;

import com.dvdev.oop2.example3.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " is hitting with a sword an enemy " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

}
