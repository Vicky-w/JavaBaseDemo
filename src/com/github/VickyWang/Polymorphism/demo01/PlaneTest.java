package com.github.VickyWang.Polymorphism.demo01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class PlaneTest {
    public static void main(String[] args) {
        Plane a1 = new Airliner("波音747", 800, 12000, 300);
        a1.start();
        a1.fly();
        a1.land();
        a1.attack();

        System.out.println("======================================");
        Plane w1 = new WarPlane("F22", 950, 15000, 15);
        w1.start();
        w1.fly();
        w1.land();

        ((WarPlane)w1).attack(1);
        ((WarPlane)w1).attack(10);
        ((WarPlane)w1).attack(20);
        w1.attack();
    }
}

