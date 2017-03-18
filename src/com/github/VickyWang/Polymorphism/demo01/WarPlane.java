package com.github.VickyWang.Polymorphism.demo01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class WarPlane extends Plane {
    private int loader;

    public WarPlane() {
        super();
    }

    public WarPlane(String name, int speed, int flyHeight, int loader) {
        super(name, speed, flyHeight);
        this.loader = loader;
    }

    public void attack(int x) {
        if (x > loader) {
            System.out.println("哒哒哒。。。");
        } else {
            loader = loader - x;
            System.out.println(getName() + "向敌机发射了" + x + "枚导弹。还剩"+loader+"枚");
        }
    }

    public void attack(){
        System.out.println("哒哒哒。。。");
    }

    @Override
    public void start() {
        System.out.println(getName() + "携带着" + loader + "枚导弹和无数炮弹从航空母舰上起飞。");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "携带着" + loader + "枚导弹和无数炮弹在天空中寻找敌机。");
    }

    @Override
    public void land() {
        System.out.println(getName() + "携带着" + loader + "枚导弹和无数炮弹返回航空母舰，准备降落。");
    }

}