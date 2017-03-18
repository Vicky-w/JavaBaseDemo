package com.github.VickyWang.ClassTest02;

import java.util.Date;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class DriverTest {
    public static void main(String[] args) {
        Car tg = new Car("途观", 150, 220000, new Date());
        Car lh = new Car("路虎", 180, 660000, new Date());
        Car hm = new Car("悍马", 200, 850000, new Date());
        Driver zl = new Driver("张辽", 35);
        Driver zy = new Driver("赵云", 28);
        zl.setCar(tg);
        zy.setCar(hm);

        zl.start();
        zy.start();
        zl.drive();
        zy.drive();

        zl.setCar(lh);
        zl.start();
        zl.drive();

        zy.setCar(null);
        zy.start();
    }
}
