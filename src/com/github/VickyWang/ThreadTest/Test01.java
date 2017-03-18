package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test01 {
    public static void main(String[] args) {
        ThreadTest01 t1 = new ThreadTest01("T1");
        ThreadTest01 t2 = new ThreadTest01("T2");
        t1.start();
        t2.start();
    }
}
