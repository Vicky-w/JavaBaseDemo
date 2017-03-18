package com.github.VickyWang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ListTest02 {
    public static void main(String[] args) {
        // 老式容器(无泛型技术时)的使用方式存在如下问题：
        // 1.从容器中取元素时：不得不进行已知具体类型的强制转型
        // 2.向容器中添加元素时，不能保证元素的类型安全
        List bag = new ArrayList();
        bag.add(new Apple("富士", 200, "红"));
        bag.add(new Apple("国光", 100, "绿"));
//		bag.add(new Bomb("TNT", 200));
        bag.add(new Apple("蛇果", 150, "红"));

        for (Object object : bag) {
            Apple apple = (Apple) object;
            System.out.println(apple);
        }

        System.out.println("======================================");

        // Java1.5和1.6版本使用的容器泛型声明
        //List<Apple> appleBag = new ArrayList<Apple>();

        // Java1.7版本使用的容器泛型声明（钻石语法）
        List<Apple> appleBag = new ArrayList<>();
        appleBag.add(new Apple("富士", 200, "红"));
        appleBag.add(new Apple("国光", 100, "绿"));
        // appleBag.add(new Bomb("TNT",200));
        appleBag.add(new Apple("蛇果", 150, "红"));
        for (Apple apple : appleBag) {
            System.out.println(apple);
        }
        System.out.println("======================================");
        // 把List<Apple>变成一个Object数组
        Object[] objs = appleBag.toArray();
        // 把List<Apple>变成一个Apple数组
        // Apple[] apples = appleBag.toArray(new Apple[]{});
        Apple[] apples = appleBag.toArray(new Apple[appleBag.size()]);
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        // 把数组转型成为List
        List<Integer> intList = Arrays.asList(1,38,48,22,943,-382);
        List<Apple> newAppleBag = Arrays.asList(apples);
        List<Apple> emptyBag = Arrays.asList();
        System.out.println("======================================");
        System.out.println(intList);
        System.out.println(newAppleBag);
        System.out.println(emptyBag);

    }
}

