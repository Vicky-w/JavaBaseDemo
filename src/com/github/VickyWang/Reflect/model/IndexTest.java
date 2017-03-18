package com.github.VickyWang.Reflect.model;

import com.github.VickyWang.Reflect.IndexFieldReader;

import java.util.List;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class IndexTest {
    public static void main(String[] args) {
        List<String> indexList = IndexFieldReader.getIndexFieldName(new User());
        System.out.println(indexList);
        indexList = IndexFieldReader.getIndexFieldName(new Movie());
        System.out.println(indexList);
        indexList = IndexFieldReader.getIndexFieldName(new Car());
        System.out.println(indexList);
    }
}
