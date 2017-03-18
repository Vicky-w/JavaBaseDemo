package com.github.VickyWang.collection.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Cp> cpList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Cp cp = new Cp("裁判"+i, random.nextInt(7)+4);
            cpList.add(cp);
        }

        int sum = 0;
        int min = cpList.get(0).getScore();
        int max = cpList.get(0).getScore();
        String nameStr = "";
        String scoreStr = "";
        for (Cp cp : cpList) {
            int s = cp.getScore();
            if(min>s){
                min = s;
            }
            if(max<s){
                max = s;
            }
            sum = sum + s;
            nameStr = nameStr+cp.getName()+"\t";
            scoreStr = scoreStr+cp.getScore()+"\t";
        }
        System.out.println(nameStr);
        System.out.println(scoreStr);
        System.out.println("AVG: "+((sum-min-max)/8.0));
    }
}
