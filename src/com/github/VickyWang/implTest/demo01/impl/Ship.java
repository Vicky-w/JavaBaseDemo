package com.github.VickyWang.implTest.demo01.impl;

import com.github.VickyWang.implTest.demo01.Swimable;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class Ship implements Swimable {

    @Override
    public void swim() {
        System.out.println("轮船在水上行驶");
    }

}
