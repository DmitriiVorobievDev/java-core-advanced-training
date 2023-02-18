package com.dvdev.oop2.example2;

import com.dvdev.oop2.example3.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
//        System.out.println(getName() + " is shooting a bow in an enemy " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " and " + Archer.this.getName() + " are damaging together");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }

    }

}
