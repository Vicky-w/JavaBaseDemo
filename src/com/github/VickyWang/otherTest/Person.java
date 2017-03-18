package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Person {
    /**
     * 1 静态块
     * 2 安书写顺序执行成员变量的初始化和非静态块
     * 3 构造器
     */
    public static int count;

    private String name = "Mike";

    {
        name = "Tom";
        age = 30;
        System.out.println("non-static block");
    }

    private int age = 20;

    static {
        count = 0;
        //name="sss";
        System.out.println("static block");
    }


    public Person() {
        super();
        System.out.println("constructor1");
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("constructor2");
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
