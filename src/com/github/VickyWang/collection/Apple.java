package com.github.VickyWang.collection;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Apple implements Comparable<Apple> {
    private String name;
    private int weight;
    private String color;

    public Apple() {
        super();
    }

    public Apple(String name, int weight, String color) {
        super();
        this.name = name;
        this.weight = weight;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
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
        Apple other = (Apple) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
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
        return "Apple [name=" + name + ", weight=" + weight + ", color=" + color + "]";
    }

    @Override
    public int compareTo(Apple other) {
        // 在这个方法中定义的是比较逻辑
        // 当前对象如果比对比对象大，则返回正值；如果比对比对象小则返回负值；如果相等则0
		/*if(this.getWeight()>other.getWeight()){
			return 1;
		}else if(this.getWeight()<other.getWeight()){
			return -1;
		}else{
			return 0;
		}*/
        return this.getWeight()-other.getWeight();
    }
}
