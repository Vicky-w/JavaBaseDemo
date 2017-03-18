package com.github.VickyWang.ApachePoi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Connect {
    private String name;
    private String address;
    private String tel;
    private Date birthday;

    public Connect() {
        super();
    }

    public Connect(String name, String address, String tel, Date birthday) {
        super();
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthdayStr(){
        if(birthday==null){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(birthday);
    }

    public void setBirthdayStr(String str){
        if(str==null||str.equals("")){
            this.birthday=null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            this.birthday = sdf.parse(str);
        } catch (ParseException e) {
            this.birthday=null;
            e.printStackTrace();
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
        Connect other = (Connect) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Connect [name=" + name + ", address=" + address + ", tel=" + tel + ", birthday=" + birthday + "]";
    }
}
