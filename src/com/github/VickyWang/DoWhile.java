package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class DoWhile {
    public static void main(String[] args) {
        int sum = 1;
        int i = 2;
        do {
            sum = sum * i;
            i++;
        } while (i <= 10);
        System.out.println(sum);
    }
}
