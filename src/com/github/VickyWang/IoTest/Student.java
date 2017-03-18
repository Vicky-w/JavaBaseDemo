package com.github.VickyWang.IoTest;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 2L;

    private String name;
    private String hometown;
    private String stuNo;

    public Student() {
        super();
    }

    public Student(String name, String hometown, Date birthday) {
        super();
        this.name = name;
        this.hometown = hometown;
    }

    public Student(String name, String hometown, Date birthday, String stuNo) {
        super();
        this.name = name;
        this.hometown = hometown;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hometown == null) ? 0 : hometown.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((stuNo == null) ? 0 : stuNo.hashCode());
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
        Student other = (Student) obj;
        if (hometown == null) {
            if (other.hometown != null)
                return false;
        } else if (!hometown.equals(other.hometown))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (stuNo == null) {
            if (other.stuNo != null)
                return false;
        } else if (!stuNo.equals(other.stuNo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", hometown=" + hometown + ",  stuNo=" + stuNo + "]";
    }
}