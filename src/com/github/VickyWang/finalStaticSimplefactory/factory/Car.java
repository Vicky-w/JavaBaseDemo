package com.github.VickyWang.finalStaticSimplefactory.factory;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Car {
    private String name;
    private String color;
    private int price;

    public Car() {
        super();
        this.name = "奔驰";
        this.color = "黑色";
        this.price = 60;
    }

    private Car(String name, String color, int price) {
        super();
        this.name = name;
        this.color = color;
        this.price = price;
    }

    /*
     * 静态工厂方法：是工厂模式中的一种
     * 优点：可以替代构造器来构造对象实例，使用方法的名字来说明这个方法要生产的对象实例的特征
     * 		可以返回本类或其子类的对象，比使用构造器来构造对象类型更加丰富。
     */
    public static Car getTuAn(String color,int price){
        return new Car("途安", color, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
    }
}
