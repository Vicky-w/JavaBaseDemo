package com.github.VickyWang.otherTest.clothes;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Clothes {
    private String name;
    private ClothesColor color;
    private ClothesSize size;

    public Clothes() {
        super();
    }

    public Clothes(String name, ClothesColor color, ClothesSize size) {
        super();
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClothesColor getColor() {
        return color;
    }

    public void setColor(ClothesColor color) {
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
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
        Clothes other = (Clothes) obj;
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
        if (size == null) {
            if (other.size != null)
                return false;
        } else if (!size.equals(other.size))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Clothes [name=" + name + ", color=" + color + ", size=" + size.getDesc() + "]";
    }
}

