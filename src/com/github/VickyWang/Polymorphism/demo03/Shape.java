package com.github.VickyWang.Polymorphism.demo03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public abstract class Shape {
    public abstract String getName();

    public abstract double getArea();

    public void printInfo(){
        System.out.println(getName()+"的面积是"+getArea());
    }
}