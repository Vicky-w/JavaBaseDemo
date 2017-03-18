package com.github.VickyWang.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class MapTest01 {

    public static void main(String[] args) {
        Map<Integer, Apple> appleMap = new HashMap<>();

        Apple a1 = new Apple("绿", 130);
        Apple a2 = new Apple("黄", 230);
        Apple a3 = new Apple("红", 150);
        Apple a4 = new Apple("绿", 220);
        Apple a5 = new Apple("紫", 300);

        // 使用put方法可以向map对象中添加条目
        appleMap.put(1, a1);
        appleMap.put(2, a2);
        appleMap.put(3, a3);
        appleMap.put(4, a4);
        appleMap.put(5, a5);

        // 从map对象中获取键是3的对象，使用get方法
        Apple thirdApple = appleMap.get(3);
        System.out.println(thirdApple);
        // 如果键不存在时，使用get方法会得到null
        Apple notExist = appleMap.get(100);
        System.out.println(notExist);
        // Java 1.8以后可以使用getOrDefault方法来得到某个键对应的值
        // 如果键不存在时，则返回这个方法第二个参数设置的默认对象
        notExist = appleMap.getOrDefault(100, new Apple("花", 1000));
        System.out.println(notExist);

        System.out.println(appleMap.get(5));
        // 在使用put方法时，如果要操作的键值对的键已经在map对象中存在，则会把新的值替换到原有的值上
        appleMap.put(5,new Apple("迷彩",3000));
        System.out.println(appleMap.get(5));
        System.out.println(appleMap.size());

        // 按照键来移除Map的条目
        appleMap.remove(5);
        System.out.println(appleMap.get(5));
        System.out.println(appleMap.size());

        System.out.println("======================================");

        // 使用键的Set来进行Map对象中条目的遍历
        Set<Integer> keySet = appleMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key+":"+appleMap.get(key));
        }

        // 使用Entry的Set进行Map对象的遍历
        Set<Entry<Integer, Apple>> entrySet = appleMap.entrySet();
        for (Entry<Integer, Apple> entry : entrySet) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

}
