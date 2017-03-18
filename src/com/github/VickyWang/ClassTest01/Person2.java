package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Person2 {
    private String name;
    private int age;
    private String gender;
    private int height;
    private int weight;
    private String hometown;

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
        if (age < 0 || age > 150) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Person2 [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
                + weight + ", hometown=" + hometown + "]";
    }

}
