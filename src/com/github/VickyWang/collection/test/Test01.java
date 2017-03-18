package com.github.VickyWang.collection.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(11);
            scoreList.add(num);
        }
        System.out.println(scoreList);

        int sum = 0;
        int max = scoreList.get(0);
        int min = scoreList.get(0);
        for (Integer score : scoreList) {
            if (min > score) {
                min = score;
            }
            if (max < score) {
                max = score;
            }
            sum = sum + score;
        }
        System.out.println("Avg score is: "+((sum-max-min)/8.0));
    }

}
