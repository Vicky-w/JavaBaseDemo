package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ThreadTest01 extends Thread {
    private String name;

    public ThreadTest01(String name) {
        super();
        this.name = name;
    }

    // start()方法表示线程进行就绪状态
    // run()方法表示线程进行运行状态
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("这是一条线程:" + name);
        }
    }

}
