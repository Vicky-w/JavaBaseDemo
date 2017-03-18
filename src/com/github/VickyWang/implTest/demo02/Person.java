package com.github.VickyWang.implTest.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Person implements Codable,Teachable{
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public void coding(String lang) {
        System.out.println(name+"正在使用"+lang+"语言写程序");
    }

    @Override
    public void teach(String subject) {
        System.out.println(name+"正在使用教"+subject);
    }
}
