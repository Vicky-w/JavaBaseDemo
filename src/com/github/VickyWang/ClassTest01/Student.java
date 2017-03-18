package com.github.VickyWang.ClassTest01;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String hometown;
    private int gender;
    private int score;
    private String tel;

    public Student() {
        this.id = (int) (Math.random() * 100000);
    }

    public Student(String name, int score) {
        this();
        this.name = name;
        this.score = score;
    }

    public Student(String name, int age, String hometown, int gender, int score, String tel) {
        this(name,score);
        this.age = age;
        this.hometown = hometown;
        this.gender = gender;
        this.tel = tel;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", hometown=" + hometown + ", gender=" + gender
                + ", score=" + score + ", tel=" + tel + "]";
    }
}
