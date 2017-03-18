package com.github.VickyWang.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ListTest03 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(478);
        intList.add(1);
        intList.add(23);
        intList.add(3482);
        intList.add(9);
        System.out.println(intList);

        // 对容器中的元素进行升序排序
        Collections.sort(intList);
        System.out.println(intList);
        // 对容器中的元素进行降序排序
        Collections.reverse(intList);
        System.out.println(intList);

        List<Apple> appleBag = new ArrayList<>();
        appleBag.add(new Apple("富士", 200, "红"));
        appleBag.add(new Apple("国光", 80, "绿"));
        appleBag.add(new Apple("国光", 100, "绿"));
        appleBag.add(new Apple("蛇果", 150, "红"));
        appleBag.add(new Apple("蛇果", 180, "红"));

        Collections.sort(appleBag);
        System.out.println(appleBag);

        appleBag = new ArrayList<>();
        appleBag.add(new Apple("富士", 200, "红"));
        appleBag.add(new Apple("国光", 80, "绿"));
        appleBag.add(new Apple("国光", 100, "绿"));
        appleBag.add(new Apple("蛇果", 150, "红"));
        appleBag.add(new Apple("蛇果", 180, "红"));

		/*Collections.sort(appleBag, new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o2.getWeight()-o1.getWeight();
			}
		});*/
        Collections.sort(appleBag,new AppleCompartor());
        System.out.println(appleBag);
    }

    private static class AppleCompartor implements Comparator<Apple>{

        @Override
        public int compare(Apple o1, Apple o2) {
            return o2.getWeight()-o1.getWeight();
        }

    }
}