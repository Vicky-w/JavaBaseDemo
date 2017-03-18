package com.github.VickyWang.finalStaticSimplefactory.staticTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test01 {
    public static void main(String[] args) {
        StaticTest01 t1 = new StaticTest01("TTT", 30);
        System.out.println(t1);
        System.out.println(StaticTest01.getCount());
        StaticTest01 t2 = new StaticTest01("SSS", 40);
        System.out.println(t2);
        System.out.println(StaticTest01.getCount());

        print();
    }

    // static方法不可以调用非static方法，也不可以访问非static成员变量
    public static void print() {
        // print2();这是错误的
        System.out.println("xxx");
    }

    // 非static方法可以调用static方法，也可以访问static成员变量
    public void print2() {
        print();
    }
}
