package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTest02("T11111"));
        t1.setName("线程A");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(new ThreadTest02("T22222"));
        t1.setName("线程B");
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
