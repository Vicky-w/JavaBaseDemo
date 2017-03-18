package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTest02("T11111"));
        Thread t2 = new Thread(new ThreadTest02("T22222"));
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 80; i++) {
                    System.out.println("==========================");
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
