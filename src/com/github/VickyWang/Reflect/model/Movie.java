package com.github.VickyWang.Reflect.model;

import java.util.Arrays;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Movie {
    @IndexField
    private String name;
    private int year;
    @IndexField
    private String intro;
    @IndexField
    private String dric;
    private String[] casts;

    public Movie() {
        super();
    }

    public Movie(String name, int year, String intro, String dric, String[] casts) {
        super();
        this.name = name;
        this.year = year;
        this.intro = intro;
        this.dric = dric;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDric() {
        return dric;
    }

    public void setDric(String dric) {
        this.dric = dric;
    }

    public String[] getCasts() {
        return casts;
    }

    public void setCasts(String[] casts) {
        this.casts = casts;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(casts);
        result = prime * result + ((dric == null) ? 0 : dric.hashCode());
        result = prime * result + ((intro == null) ? 0 : intro.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + year;
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
        Movie other = (Movie) obj;
        if (!Arrays.equals(casts, other.casts))
            return false;
        if (dric == null) {
            if (other.dric != null)
                return false;
        } else if (!dric.equals(other.dric))
            return false;
        if (intro == null) {
            if (other.intro != null)
                return false;
        } else if (!intro.equals(other.intro))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", year=" + year + ", intro=" + intro + ", dric=" + dric + ", casts="
                + Arrays.toString(casts) + "]";
    }

}
