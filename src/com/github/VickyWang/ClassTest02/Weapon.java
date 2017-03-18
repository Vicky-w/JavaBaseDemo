package com.github.VickyWang.ClassTest02;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Weapon {
    private String name;
    private int minAp;
    private int maxAp;

    public Weapon() {
        super();
    }

    public Weapon(String name, int minAp, int maxAp) {
        super();
        this.name = name;
        this.minAp = minAp;
        this.maxAp = maxAp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinAp() {
        return minAp;
    }

    public void setMinAp(int minAp) {
        this.minAp = minAp;
    }

    public int getMaxAp() {
        return maxAp;
    }

    public void setMaxAp(int maxAp) {
        this.maxAp = maxAp;
    }

    public int getHarm() {
        return (int) ((maxAp + 1) + (minAp - (maxAp + 1)) * Math.random());
    }

    @Override
    public String toString() {
        return "Weapon [name=" + name + ", minAp=" + minAp + ", maxAp=" + maxAp + "]";
    }
}
