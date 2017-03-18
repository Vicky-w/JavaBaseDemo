package com.github.VickyWang.implTest.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张小平", 25);
        p1.coding("C");
        p1.teach("高数");

        Cat c1 = new Cat("铁蛋儿", 5);
        c1.coding("python");

        Codable coder = new Person("李小军",30);
        coder.coding("Java");
        coder = new Cat("土豆儿",6);
        coder.coding("Java");
    }
}

