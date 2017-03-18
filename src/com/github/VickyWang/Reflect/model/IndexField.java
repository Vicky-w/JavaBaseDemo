package com.github.VickyWang.Reflect.model;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义的注解可以标注在什么样的程序成员上
@Target({ElementType.FIELD})
// 决定自定义注解何时起作用
@Retention(RetentionPolicy.RUNTIME)
public @interface IndexField {

}