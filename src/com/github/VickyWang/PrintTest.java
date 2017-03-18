package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class PrintTest {
    public static void main(String[] args) {

        System.out.println("================== Point-Test ====================");
        System.out.println(10 / 4);//2
        System.out.println(10 / 4.0);//2.5
        System.out.println(10.0 / 4);//2.5
        System.out.println(10.0 / 4.0);//2.5

        System.out.println("================== Binary-System ====================");
        System.out.println(3.0 + 0.8);//3.8
        System.out.println(2.0 - 1.1);//0.899999

        System.out.println("================== ++ Test ====================");
        int i = 10;
        int j = i++;
        System.out.println(i);//11
        System.out.println(j);//10
        i = 10;
        i++;
        System.out.println(i);//11
        i = 10;
        ++i;
        System.out.println(i);//11
    }
}
