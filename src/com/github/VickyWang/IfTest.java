package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class IfTest {
    public static void main(String[] args) {
        System.out.println("================ 闰年判断 ===============");
        System.out.println("================ 局部变量在第一次使用前必须显式的赋予初始值 ===============");
        int year = 1000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
        System.out.println("=====================================");
        System.out.println("================ if/else if/else ===============");
        double p = 10002;
        if (p <= 0) {
            System.out.println("请输入正确的价格");
        } else if (p > 0 && p <= 1000) {
            System.out.println(p);
        } else if (p > 1000 && p <= 3000) {
            System.out.println(p * 0.9);
        } else if (p > 3000 && p <= 5000) {
            System.out.println(p * 0.85);
        } else {
            System.out.println(Math.round(p * 0.7 * 100) / 100.0);
        }
    }
}
