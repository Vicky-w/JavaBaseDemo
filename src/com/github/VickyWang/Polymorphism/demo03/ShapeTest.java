package com.github.VickyWang.Polymorphism.demo03;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Square(5.0);
        shape.printInfo();

        shape= new Rectangle(20, 8);
        shape.printInfo();

        shape = new Cycle(5.0);
        shape.printInfo();
    }

}

