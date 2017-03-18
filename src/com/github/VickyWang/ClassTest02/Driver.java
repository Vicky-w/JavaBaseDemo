package com.github.VickyWang.ClassTest02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Driver {
    private String name;
    private int age;
    private Car car;

    public Driver() {
        super();
    }

    public Driver(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Driver(String name, int age, Car car) {
        super();
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void start() {
        if (car == null) {
            System.out.println(name + "得先摇号去");
        } else {
            System.out.println(name + "正在启动" + car.getName());
        }
    }

    public void drive() {
        System.out.println(name + "正在以" + car.getMaxSpeed() + "km/h的速度驾驶" + car.getName());
    }

    @Override
    public String toString() {
        return "Driver [name=" + name + ", age=" + age + ", car=" + car + "]";
    }
}
