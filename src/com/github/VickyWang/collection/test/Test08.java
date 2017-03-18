package com.github.VickyWang.collection.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test08 {
    public static void main(String[] args) {

        List<Integer> redPool = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            redPool.add(i + 1);
        }

		/*
		 * List<Integer> redPool = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		 * 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
		 * 28, 29, 30, 31, 32, 33);
		 */

        List<Integer> result = new ArrayList<>(6);
        Random ran = new Random();
        for (int i = 0; i < 6; i++) {
            int index = ran.nextInt(redPool.size());
            result.add(redPool.get(index));
            redPool.remove(index);
        }
        int blue = ran.nextInt(16) + 1;
        System.out.println(result + " " + blue);
    }
}
