package com.github.VickyWang.Polymorphism.demo02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public abstract class Employee {
    private String name;
    private int salary;

    public Employee() {
        super();
    }

    public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}
