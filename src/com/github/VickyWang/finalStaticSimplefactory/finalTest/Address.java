package com.github.VickyWang.finalStaticSimplefactory.finalTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Address {
    private String street;
    private String tel;

    public Address() {
        super();
    }

    public Address(String street, String tel) {
        super();
        this.street = street;
        this.tel = tel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", tel=" + tel + "]";
    }
}
