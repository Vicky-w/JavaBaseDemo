package com.github.VickyWang.Proxy;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test {

    public static void main(String[] args) {
        CanRun one = new RunnerProxy(new Runner("Tom"));
        one.run();
    }

}

