package com.github.VickyWang.ThreadTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest03 tt = new ThreadTest03();
        Thread t = new Thread(tt);
        t.start();
        Thread.sleep(3000);
        tt.stop();
    }
}
