package com.dvdev.oop2.example2;

import com.dvdev.oop2.example3.MagicWeapon;

public class Mage<T extends MagicWeapon> extends  Hero<T>{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " is casting a spell in an enemy " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

}
