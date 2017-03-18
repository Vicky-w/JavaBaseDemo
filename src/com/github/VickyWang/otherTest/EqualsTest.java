package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Car c1 = new Car("A", "black", 30);
        Car c2 = new Car("B", "Red", 30);
        Car c3 = new Car("B", "red", 30);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(null));
        System.out.println(c2.equals(c3));
    }
}
