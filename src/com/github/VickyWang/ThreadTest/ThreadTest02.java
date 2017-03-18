package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ThreadTest02  implements Runnable   {
    private String name;

    public ThreadTest02(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("这是一条线程:" + name);
        }
    }

}
