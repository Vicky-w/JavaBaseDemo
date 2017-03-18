package com.github.VickyWang.otherTest;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class PackageTypeTest {
    public static void main(String[] args) {
        //Byte b1 = new Byte((byte)5);
        Byte b1 = new Byte("5");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        // 得到b1对象的值，并转型成为int
        // xxxValue()可以把Byte的类型对象转型成xxx的基本数据类型
        System.out.println(b1.intValue());
        // 把b1转型为String
        System.out.println(b1.toString());
        // 通过Byte的静态方法parseByte可以把一个字符串转型成byte类型
        byte b2 = Byte.parseByte("29");

        Short s1 = new Short("2389");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(s1.byteValue());

        Integer int1 = new Integer(329);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(int1.longValue());

        Long long1 = new Long("83929283");
        Float f1 = new Float("23829.33");
        Double d1 = new Double("23029.30293");
        Boolean bool = new Boolean("true");
        Character c1 = new Character('\u0097');

        System.out.println(int1*2);
        System.out.println(int1.intValue()*2);
    }
}
