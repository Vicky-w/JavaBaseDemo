package com.github.VickyWang.collection.test;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test06 {
    public static void main(String[] args) {
        Random ran = new Random();
        Set<Integer> set = new TreeSet<>();

        int c = 0;
        while(c<10){
            int n = ran.nextInt(15)+1;
            if(set.add(n)){
                c++;
            }
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}