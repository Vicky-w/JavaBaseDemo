package com.github.VickyWang.Polymorphism.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class Coder extends Employee {
    private int restDay;

    public int getRestDay() {
        return restDay;
    }

    public void setRestDay(int restDay) {
        this.restDay = restDay;
    }

    public void work() {
        System.out.println("写程序");
    }

    @Override
    public String toString() {
        return "程序员 [restDay=" + restDay + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
    }

}