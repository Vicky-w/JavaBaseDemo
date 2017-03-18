package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person zl = new Person();
        zl.name="张辽";
        zl.age=40;
        zl.gender="男";
        zl.height=175;
        zl.weight=80;
        zl.hometown="河北";

        zl.eat("包子");
        zl.drink("北冰洋（桔子味儿的）");
        zl.getInfo();

        Person lb = new Person();
        lb.name="吕布";
        lb.age=45;
        lb.gender="男";
        lb.height=185;
        lb.weight=89;
        lb.hometown="山西";
        lb.eat("烤鸭");
        lb.drink("豆汁儿");
        lb.getInfo();
    }
}
