package com.github.VickyWang.implTest.demo01.impl;

import com.github.VickyWang.implTest.demo01.Flyable;
import com.github.VickyWang.implTest.demo01.Movable;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Plane implements Movable, Flyable {

    @Override
    public void fly() {
        System.out.println("飞机在天空中飞行");
    }

    @Override
    public void run() {
        System.out.println("飞机在跑道上划行");
    }

}
