package com.github.VickyWang.InvocationHandler;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Agent implements InvocationHandler {
    private Subject subject;

    public Agent(Subject subject) {
        super();
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before");
        method.invoke(subject, new Object[]{});
        System.out.println("After");

        return null;
    }

}

