package com.github.VickyWang.finalStaticSimplefactory.finalTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class FinalTest02 {
    public final void print(){
        System.out.println("do something.");
    }
    // final与abstract不可以同时使用，因为他们的作用是相反的
    // 不能让子类既必须实现一个方法，又让这个方法不能被覆盖
    // public final abstract void print2();
}
