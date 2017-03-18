package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class MethodArgument {
    // 一个方法内部不能改变外部调用的一个基本数据类型参数的值
    public static int test1(int x){
        x = 100;
        return x;
    }

    // 一个方法可以改变对象类型参数的成员变量值
    public static void test2(Car car){
        car.setName("新车");
    }

    // 一个方法不能让对象类型的参数引用到另一个新的对象上
    // 在一个方法内部通过这个方法的参数传入的对象引用改变只在这个方法内部有效，出了这个方法就会失效。
    public static void test3(Car car){
        car = new Car("new car","black",50000);
    }

    public static void main(String[] args) {
        int x = 10;
        int x1 = test1(x);
        System.out.println(x);
        System.out.println(x1);
        System.out.println("======================================");

        Car car = new Car("老车", "red", 30000);
        test2(car);
        System.out.println(car);

        System.out.println("======================================");
        car = new Car("老车", "red", 30000);
        test3(car);
        System.out.println(car);
    }

}
