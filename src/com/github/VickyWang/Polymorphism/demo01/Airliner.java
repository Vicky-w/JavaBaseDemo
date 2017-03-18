package com.github.VickyWang.Polymorphism.demo01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Airliner extends Plane {
    private int quantity;

    public Airliner() {
        super();
    }

    public Airliner(String name, int speed, int flyHeight, int quantity) {
        super(name, speed, flyHeight);
        this.quantity = quantity;
    }

    public void attack(){
        System.out.print("以下攻击行为来自Plane父类：");
        super.attack();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void start() {
        System.out.println(getName()+"承载着"+quantity+"乘客，从长长的跑道上加速，正在起飞。");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"承载着"+quantity+"乘客，在蓝天上以自动巡航模式飞行。");
    }

    @Override
    public void land() {
        System.out.println(getName()+"承载着"+quantity+"乘客，正在降落。");
    }

}

