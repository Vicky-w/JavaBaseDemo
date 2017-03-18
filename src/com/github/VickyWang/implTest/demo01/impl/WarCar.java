package com.github.VickyWang.implTest.demo01.impl;

import com.github.VickyWang.implTest.demo01.Attackable;
import com.github.VickyWang.implTest.demo01.Flyable;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class WarCar extends Car implements Attackable,Flyable {

    @Override
    public void attack() {
        System.out.println("战斗汽车向目标发射了n枚炮弹");
    }

    @Override
    public void fly() {
        System.out.println("战斗汽车在天空中飞行");
    }

}

