package com.github.VickyWang.finalStaticSimplefactory.finalTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class FinalTest03 {

    private final int age;
    private final String name;
    private final Address address;

    public FinalTest03(int age, String name, Address address) {
        super();
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static void main(String[] args) {
        FinalTest03 test = new FinalTest03(30, "Tom",new Address("bj","3298293"));
        // 对于final的基本数据类型成员变量，不可以改变其值
        // 对于final的引用类型成员变量，不可以改变其引用
        // 如果引用类型的成员变量是不可变对象，则不可以修改其对象的内部状态（属性值）
        // 如果引用类型的成员变量是可变对象，则可以修改其对象的内部状态（属性值）
        //test.address = new Address("ksdf","3829589");
        //test.age = 40;
        //test.name="Some";
        test.address.setStreet("shanhailu");
        ;	}
}

