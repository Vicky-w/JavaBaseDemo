package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Recursion {
    public static int jc(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * jc(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(jc(3));
    }
}
