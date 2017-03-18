package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class MathTest {
    public static void main(String[] args) {
        // abs：绝对值
        System.out.println(Math.abs(1.5));
        System.out.println(Math.abs(-1.5));
        System.out.println(Math.abs(0));

        // ceil：向上取整
        System.out.println(Math.ceil(5.8));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.0));
        System.out.println(Math.ceil(5.00000001));
        System.out.println("======================================");
        // floor：向下取整
        System.out.println(Math.floor(5.8));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(5.0));
        System.out.println(Math.floor(4.99999999999));
        System.out.println("======================================");
        System.out.println(Math.round(5.8));
        System.out.println(Math.round(5.1));
        System.out.println(Math.round(5.155543*10000)/10000.0);
        System.out.println("======================================");

        System.out.println(Math.min(100, 10));
        System.out.println(Math.max(100, 10));

        // pow是幂运算方法：第一个参数是底，第二个参数是幂
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.pow(2, -3));
        System.out.println(Math.pow(2, 0));

        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(-144));

        // random可以生成一个0到1之间的随机小数，但不包含1
        System.out.println(Math.random());
    }
}
