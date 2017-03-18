package com.github.VickyWang.Polymorphism.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("说瞎话");
    }


    @Override
    public String toString() {
        return "我是经理： [name=" + getName() + ", salary=" + getSalary()+" bonus=" + bonus + "]";
    }


}