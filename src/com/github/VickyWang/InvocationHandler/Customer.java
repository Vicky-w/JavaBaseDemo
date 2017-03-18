package com.github.VickyWang.InvocationHandler;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Customer implements Subject {
    private String name;

    public Customer() {
        super();
    }

    public Customer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void rent() {
        System.out.println(name+"出租自己的房子");
    }

}
