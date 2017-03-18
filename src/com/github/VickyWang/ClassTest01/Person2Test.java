package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Person2Test {
    public static void main(String[] args) {
        Person2 zl = new Person2();
        zl.setName("张辽");
        zl.setAge(40000);
        zl.setGender("男");
        zl.setHeight(175);
        zl.setWeight(80);
        zl.setHometown("河北");

        System.out.println(zl.toString());
    }
}
