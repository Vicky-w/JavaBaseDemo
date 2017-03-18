package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Singleton02 {
    //饿汉单例模式
    private static Singleton02 instance = new Singleton02();

    private Singleton02() {
        super();
    }

    public static Singleton02 getInstance(){
        return instance;
    }
}