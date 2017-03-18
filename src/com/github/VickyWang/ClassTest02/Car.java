package com.github.VickyWang.ClassTest02;
import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Car {
    private String name;
    private int maxSpeed;
    private int price;
    private Date proDate;

    public Car() {
        super();
    }

    public Car(String name, int maxSpeed, int price, Date proDate) {
        super();
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.proDate = proDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", maxSpeed=" + maxSpeed + ", price=" + price + ", proDate=" + proDate + "]";
    }
}
