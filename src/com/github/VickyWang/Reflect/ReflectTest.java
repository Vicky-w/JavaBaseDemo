package com.github.VickyWang.Reflect;

import com.github.VickyWang.Reflect.model.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class ReflectTest {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException,
            NoSuchFieldException, SecurityException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        User user = new User("Tom", "男", 33);

        Class<?> clazz = user.getClass();
        System.out.println("类的全限定名称：" + clazz.getName());
        System.out.println("简写的类名：" + clazz.getSimpleName());

        Field[] fields = clazz.getDeclaredFields();
        System.out.println(clazz.getSimpleName() + "中定义的成员变量如下：");
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("\t" + field.getName() + ":" + field.get(user));
            field.setAccessible(false);
        }

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println(nameField.getName() + ":" + nameField.get(user));
        nameField.set(user, "Mike");
        System.out.println(nameField.getName() + ":" + nameField.get(user));
        nameField.setAccessible(false);

        System.out.println(clazz.getSimpleName() + "中定义的方法如下：");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("\t" + method.getName());
        }

        Method getGenderMethod = clazz.getDeclaredMethod("getGender");
        String gender = (String) getGenderMethod.invoke(user);
        System.out.println(gender);

        Method setGenderMethod = clazz.getDeclaredMethod("setGender", String.class);
        setGenderMethod.invoke(user, "未知");
        gender = (String) getGenderMethod.invoke(user);
        System.out.println(gender);

        User u = (User) clazz.newInstance();
        System.out.println(u);

        Constructor<?> con = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        User u1 = (User) con.newInstance("张小丰", "女", 25);
        System.out.println(u1);
    }

}