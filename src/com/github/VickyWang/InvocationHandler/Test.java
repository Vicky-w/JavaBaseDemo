package com.github.VickyWang.InvocationHandler;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Customer("Tom");
        InvocationHandler proxy = new Agent(subject);
        Subject  proxySubject = (Subject) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), proxy);

        System.out.println(proxySubject.getClass().getName());
        proxySubject.rent();
    }

}