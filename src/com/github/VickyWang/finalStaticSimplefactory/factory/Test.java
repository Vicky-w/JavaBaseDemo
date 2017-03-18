package com.github.VickyWang.finalStaticSimplefactory.factory;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test {
    public static void main(String[] args) {
        Car bc = new Car();
        Car ta = Car.getTuAn("白色", 30);
        System.out.println(bc);
        System.out.println(ta);
    }
}
