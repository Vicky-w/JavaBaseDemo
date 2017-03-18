package com.github.VickyWang.Polymorphism.demo01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public abstract class Plane {
    private String name;
    private int speed;
    private int flyHeight;

    public Plane() {
        super();
    }

    public Plane(String name, int speed, int flyHeight) {
        super();
        this.name = name;
        this.speed = speed;
        this.flyHeight = flyHeight;
    }

    public abstract void start();
    public abstract void fly();
    public abstract void land();

    public void attack(){
        System.out.println("撞");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    @Override
    public String toString() {
        return "Plane [name=" + name + ", speed=" + speed + ", flyHeight=" + flyHeight + "]";
    }
}

