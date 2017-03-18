package com.github.VickyWang.otherTest;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class BigNumberTest {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("23890523049509238409280598209438029834098239048234023948290348");
        BigInteger bi2 = new BigInteger("35982378494029347823523409283490234");
        System.out.println(bi1.add(bi2));// +
        System.out.println(bi1.subtract(bi2));// -
        System.out.println(bi1.multiply(bi2));// *
        System.out.println(bi1.divide(bi2));// /
        System.out.println(bi1.mod(bi2));// %

        BigDecimal bd1 = new BigDecimal("28349523.2385960823482034809829034");
        BigDecimal bd2 = new BigDecimal("6889243385892349.48529083094820934");
        System.out.println(bd1.add(bd2));// +
        System.out.println(bd1.subtract(bd2));// -
        System.out.println(bd1.multiply(bd2));// *
        // System.out.println(bd1.divide(bd2));// /
    }
}