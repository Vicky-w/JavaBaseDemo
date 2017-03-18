package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Singleton01 {
    //懒汉单例模式
    private static Singleton01 instance;

    private Singleton01() {
        super();
    }

    public synchronized static Singleton01 getInstance(){
        if(instance==null){
            instance = new Singleton01();
        }
        return instance;
    }
}
