package com.github.VickyWang.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(11);
            scoreList.add(num);
        }
        System.out.println(scoreList);

        Collections.sort(scoreList);
        int sum = 0;
        for (int i = 1; i < scoreList.size() - 1; i++) {
            sum = sum + scoreList.get(i);
        }
        System.out.println(sum / 8.0);
    }
}
