package com.github.VickyWang.implTest.demo01.impl;

import com.github.VickyWang.implTest.demo01.Movable;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Car implements Movable {

    @Override
    public void run() {
        System.out.println("汽车在公路上行驶");
    }

}