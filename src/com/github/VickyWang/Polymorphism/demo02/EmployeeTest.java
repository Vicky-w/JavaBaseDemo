package com.github.VickyWang.Polymorphism.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Tom");
        m1.setSalary(10000);
        m1.setBonus(20000);
        System.out.println(m1);

        Coder c1 = new Coder();
        c1.setName("Mike");
        c1.setSalary(8000);
        c1.setRestDay(100);
        System.out.println(c1);

        System.out.println("======================================");
        m1.work();
        c1.work();
    }

}