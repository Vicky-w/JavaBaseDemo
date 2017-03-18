package com.github.VickyWang.Polymorphism.demo03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }

    @Override
    public String getName() {
        return "矩形";
    }

    @Override
    public double getArea() {
        return w * h;
    }

}
