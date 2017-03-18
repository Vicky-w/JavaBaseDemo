package com.github.VickyWang.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test04 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Cp> cpList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Cp cp = new Cp("裁判"+i, random.nextInt(7)+4);
            cpList.add(cp);
        }

        Collections.sort(cpList, new Comparator<Cp>() {

            @Override
            public int compare(Cp o1, Cp o2) {
                return o1.getScore()-o2.getScore();
            }
        });

        int sum = 0;
        String nameStr = "";
        String scoreStr = "";
        for (int i = 1; i < cpList.size()-1; i++) {
            Cp cp = cpList.get(i);
            sum = sum + cp.getScore();
            nameStr = nameStr+cp.getName()+"\t";
            scoreStr = scoreStr+cp.getScore()+"\t";
        }
        System.out.println(nameStr);
        System.out.println(scoreStr);
        System.out.println("AVG: "+(sum/8.0));
    }
}
