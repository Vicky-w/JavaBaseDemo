package com.github.VickyWang.otherTest.clothes;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ClothesTest {
    public static void main(String[] args) {
        // Clothes c1 = new Clothes("衬衫", "白色", "XL");
        // Clothes c2 = new Clothes("T恤", "Blue", "小号");
        // Clothes c3 = new Clothes("大衣", "#f00","小孩子穿的");
        Clothes c1 = new Clothes("衬衫", ClothesColor.BLACK, ClothesSize.XL);
        Clothes c2 = new Clothes("T恤", ClothesColor.BLUE, ClothesSize.S);
        Clothes c3 = new Clothes("大衣", ClothesColor.RED, ClothesSize.XS);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
