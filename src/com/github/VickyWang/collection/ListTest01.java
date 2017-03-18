package com.github.VickyWang.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ListTest01 {

    public static void main(String[] args) {
        // java 1.5之前的使用方式，当时泛型技术还没有出现。
        // 无论是否知道这个容器中的元素是什么类型，在取得它们时都是Object类型。
        // 后续需要对象元素对象进行手动的类型强制转换。

        // 在Java中通常是以更抽象的类型来声明变量，而以更具体的实现类来构造对象。
        List bag = new ArrayList();
        Apple a1 = new Apple("国光",35, "青色");
        Apple a2 = new Apple("黄香蕉",75, "黄色");
        Apple a3 = new Apple("蛇果",55, "红色");

        // 向容器中添加元素对象

        // 以追加的方式添加对象
        bag.add(a1);
        bag.add(a2);
        bag.add(a3);
        // 以插入方式添加对象
        // List是有序，不排重的，所以在一个bag中可以有两个以上相等对象存在
        bag.add(1, a3);

        System.out.println(bag);

        // 取得bag中的第一个Apple对象（第一个元素）
        Apple newApple = (Apple)bag.get(0);

        // 对容器中的元素进行遍历的第一种方式
        for (int i = 0; i < bag.size(); i++) {
            Apple a = (Apple) bag.get(i);
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");

        // 对容器中的元素进行遍历的第二种方式
        // 获得一个容器的迭代器对象
        // 了解即可，目前已经很少使用
        Iterator it = bag.iterator();
        while(it.hasNext()){
            Apple a = (Apple) it.next();
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");
        // 对容器中的元素进行遍历的第三种方式
        // 使用Java 1.5以后出现的增强for循环语法来进行遍历
        for (Object object : bag) {
            Apple a = (Apple) object;
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");

        // 替换元素set
        bag.set(3, new Apple("富士", 150, "粉"));
        for (Object object : bag) {
            Apple a = (Apple) object;
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");

        // 移除元素
        bag.remove(0);
        for (Object object : bag) {
            Apple a = (Apple) object;
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");

        bag.add(a3);
        bag.add(a3);
        bag.add(a3);
        for (Object object : bag) {
            Apple a = (Apple) object;
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");

        // remove(Object obj)方法，只移除容器中的第一个与参数对象相等的
        bag.remove(a3);
        for (Object object : bag) {
            Apple a = (Apple) object;
            a.setWeight(a.getWeight()+100);
            System.out.println(a);
        }
        System.out.println("======================================");
    }

}
