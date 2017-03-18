package com.github.VickyWang.otherTest;

import com.github.VickyWang.otherTest.clothes.ClothesSize;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class EnumTest {
    public static void main(String[] args) {
        // 使用valueOf方法，通过枚举的名字来得到相对应的枚举对象
        ClothesSize xl = ClothesSize.valueOf("XL");
        System.out.println(xl.getDesc());

        // values方法会按枚举的定义顺序来返回一个该枚举类型的数组
        ClothesSize[] csArr = ClothesSize.values();
        System.out.println(csArr.length);
        for (ClothesSize clothesSize : csArr) {
            // ordinal返回某个枚举对象的序号（从0开始），name方法返回某个枚举对象的名称
            System.out.println(clothesSize.ordinal()+":"+clothesSize.name());
        }
    }
}
