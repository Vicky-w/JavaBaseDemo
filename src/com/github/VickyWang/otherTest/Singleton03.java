package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Singleton03 {
    private volatile static Singleton03 instance;

    private Singleton03() {
        super();
    }

    public static Singleton03 getInstance(){
        if(instance==null){
            synchronized(Singleton03.class){
                if(instance==null){
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}