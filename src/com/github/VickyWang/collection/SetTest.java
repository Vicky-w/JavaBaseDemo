package com.github.VickyWang.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class SetTest {

    public static void main(String[] args) {
        Set<Apple> appleBag = new HashSet<>();
        appleBag.add(new Apple("富士", 200, "红"));
        appleBag.add(new Apple("国光1", 80, "绿"));
        appleBag.add(new Apple("国光2", 100, "绿"));
        appleBag.add(new Apple("蛇果1", 150, "红"));
        appleBag.add(new Apple("蛇果2", 180, "红"));
        appleBag.add(new Apple("蛇果2", 180, "红"));
        appleBag.add(new Apple("蛇果2", 180, "红"));
        appleBag.add(new Apple("蛇果2", 180, "红"));
        appleBag.add(new Apple("蛇果2", 180, "红"));

        System.out.println(appleBag.size());

        for (Apple apple : appleBag) {
            System.out.println(apple);
        }
        System.out.println("======================================");
        Iterator<Apple> it = appleBag.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<Integer> intSet = new TreeSet<>();
        intSet.add(5);
        intSet.add(50);
        intSet.add(25);
        intSet.add(35);
        intSet.add(55);
        intSet.add(55);
        intSet.add(55);
        for (Integer integer : intSet) {
            System.out.println(integer);
        }
    }

}
