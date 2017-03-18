package com.github.VickyWang.Polymorphism.demo03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Square extends Shape {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public String getName() {
        return "正方形";
    }

    @Override
    public double getArea() {
        return x * x;
    }

}
