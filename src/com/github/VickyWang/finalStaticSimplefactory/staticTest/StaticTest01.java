package com.github.VickyWang.finalStaticSimplefactory.staticTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class StaticTest01 {
    private static int count;

    private String name;
    private int age;

    public StaticTest01() {
        super();
        count++;
    }

    public StaticTest01(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StaticTest01.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StaticTest01 [name=" + name + ", age=" + age + "]";
    }
}
