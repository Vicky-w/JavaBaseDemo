package com.github.VickyWang.Polymorphism.demo03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Cycle extends Shape {
    private double r;

    public Cycle(double r) {
        super();
        this.r = r;
    }

    @Override
    public String getName() {
        return "圆形";
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

}