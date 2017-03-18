package com.github.VickyWang.collection.test;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class Word {
    private String english;
    private String chinese;
    private Set<String> desc;

    public Word() {
        super();
        this.desc = new HashSet<>();
    }

    public Word(String english, String chinese, String... desc) {
        this();
        this.english = english;
        this.chinese = chinese;
        for (String d : desc) {
            this.desc.add(d);
        }
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public Set<String> getDesc() {
        return desc;
    }

    public void setDesc(Set<String> desc) {
        this.desc = desc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chinese == null) ? 0 : chinese.hashCode());
        result = prime * result + ((desc == null) ? 0 : desc.hashCode());
        result = prime * result + ((english == null) ? 0 : english.hashCode());
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
        Word other = (Word) obj;
        if (chinese == null) {
            if (other.chinese != null)
                return false;
        } else if (!chinese.equals(other.chinese))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        } else if (!desc.equals(other.desc))
            return false;
        if (english == null) {
            if (other.english != null)
                return false;
        } else if (!english.equals(other.english))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String str =  "英文：" + english + "\n中文：" + chinese+"\n解释：";
        for (String d : desc) {
            str = str+"\n\t"+d;
        }
        return str;
    }
}