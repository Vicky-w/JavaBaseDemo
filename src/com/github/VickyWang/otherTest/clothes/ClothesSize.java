package com.github.VickyWang.otherTest.clothes;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public enum ClothesSize {
    XS("超小号"), S("小号"), M("中号"), L("大号"), XL("超大号"), XXL("超超大号");

    private String desc;

    private ClothesSize(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
