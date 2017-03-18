package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Person {
    String name;
    int age;
    String gender;
    int height;
    int weight;
    String hometown;

    public void eat(String food) {
        System.out.println(name + "在吃" + food);
    }

    public void drink(String d) {
        System.out.println(name + "在喝" + d);
    }

    public void getInfo() {
        System.out.println("姓名：" + name + " 今年" + age + "岁，" + "明年" + (age + 1) + "岁。TA是"+gender+"的");
    }
}
