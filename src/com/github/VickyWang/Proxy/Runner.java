package com.github.VickyWang.Proxy;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
import java.util.Random;

public class Runner implements CanRun {
    private String name;

    public Runner() {
        super();
    }

    public Runner(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"正在跑向终点.....");
        Random ran = new Random();
        try {
            Thread.sleep((long)ran.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Runner [name=" + name + "]";
    }

}
