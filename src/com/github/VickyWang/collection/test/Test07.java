package com.github.VickyWang.collection.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Test07 {
    public static void main(String[] args) {
        Word w1 = new Word("apple", "苹果", "是一种水果","是一个IT品牌");
        Word w2 = new Word("Windows","视窗","建筑上的窟窿","微软的OS平台");

        Map<String, Word> dic = new HashMap<>();
        dic.put(w1.getEnglish(), w1);
        dic.put(w2.getEnglish(), w2);

        System.out.println(dic.get("Windows"));
    }
}

