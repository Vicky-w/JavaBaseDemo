package com.github.VickyWang.ClassTest02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class PlayerTest {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("飓风", 400, 850);
        Weapon w2 = new Weapon("风剑", 1500, 3000);
        Player p1 = new Player("一掌毙命", 54390, 1000);
        Player p2 = new Player("一杖毙命", 44390, 800);
        p1.setWeapon(w1);
        p2.setWeapon(w2);
        // System.out.println(p1.getName() + "使用" + p1.getWeapon().getName() +
        // "造成了" + p1.attack() + "点伤害");
        // p1.setWeapon(w2);
        // System.out.println(p1.getName() + "使用" + p1.getWeapon().getName() +
        // "造成了" + p1.attack() + "点伤害");
        while (true) {
            if (p1.attack(p2)) {
                break;
            }
            if (p2.attack(p1)) {
                break;
            }
        }
    }
}
