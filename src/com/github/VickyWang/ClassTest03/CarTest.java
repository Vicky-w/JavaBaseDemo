package com.github.VickyWang.ClassTest03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class CarTest {
    public static void main(String[] args) {
        Engine e1 = new Engine("宝马3.0T", 280);
        Engine e2 = new Engine("波音3200T", 2800);
        Engine e3 = new Engine("QQ 1.2", 60);

        Car c1 = new Car("宝马", 230, e1);
        Car c2 = new Car("QQ", 5, e3);
        System.out.println(c1.getName()+"目前安装的是"+c1.getEngine().getName()+"引擎，最大时速是"+c1.getEngine().getSpeed());
        System.out.println(c2.getName()+"目前安装的是"+c2.getEngine().getName()+"引擎，最大时速是"+c2.getEngine().getSpeed());

        System.out.println("把QQ的引擎改装成波音的");
        c2.setEngine(e2);
        System.out.println(c2.getName()+"目前安装的是"+c2.getEngine().getName()+"引擎，最大时速是"+c2.getEngine().getSpeed());
        System.out.println("把宝马的引擎拆掉");
        c1.setEngine(null);
        System.out.println(c1.getName()+"目前安装的是"+c1.getEngine().getName()+"引擎，最大时速是"+c1.getEngine().getSpeed());
    }
}
