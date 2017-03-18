package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ThreadTest03 implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (true) {
            if (!flag) {
                break;
            }
            System.out.println("===Thread===");
        }
    }

    public void stop() {
        flag = false;
    }
}
