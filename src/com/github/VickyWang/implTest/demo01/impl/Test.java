package com.github.VickyWang.implTest.demo01.impl;

import com.github.VickyWang.implTest.demo01.Movable;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test {
    public static void main(String[] args) {
        // 以下代码是面向抽象编程，特点，可以灵活切换实现类
        Movable mov = new Car();
        mov.run();
        mov=new Plane();
        mov.run();

        // 以下代码是面向实现编程，特点：灵活性低下
        Car c1 = new Car();
        c1.run();
        // c1 = new Plane();
    }
}
