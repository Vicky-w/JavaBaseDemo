package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student("Tom", 630);
        System.out.println(s2);
        Student s3 = new Student("Mary", 30, "USA", 1, 600, "3802939");
        System.out.println(s3);
    }
}
