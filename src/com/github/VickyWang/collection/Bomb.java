package com.github.VickyWang.collection;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Bomb {
    private String name;
    private int weight;

    public Bomb() {
        super();
    }

    public Bomb(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bomb other = (Bomb) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bomb [name=" + name + ", weight=" + weight + "]";
    }
}