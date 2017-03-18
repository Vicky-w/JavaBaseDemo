package com.github.VickyWang;

import java.util.Random;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Break {
    public static void main(String[] args) {
        Random r = new Random();
        while (true) {
            int num = r.nextInt(10);
            if (num == 5) {
                System.out.println("5555555555555555555555555");
                break;
            }
            System.out.println(num);
        }
    }
}
