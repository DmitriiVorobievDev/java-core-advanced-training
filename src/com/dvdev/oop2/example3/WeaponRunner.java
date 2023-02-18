package com.dvdev.oop2.example3;

import com.dvdev.oop2.example2.Archer;
import com.dvdev.oop2.example2.Hero;
import com.dvdev.oop2.example2.Mage;
import com.dvdev.oop2.example2.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<Bow>("Legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<Sword>("Boromir", 10);
        warrior.setWeapon(new Sword());

        Mage<Wand> mage = new Mage<Wand>("Gendalf", 8);
        mage.setWeapon(new Wand());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
