package com.github.VickyWang.excption;

import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ExceptionTest05 {
    public static void test(){
        throw new MyException();
    }

    public static void main(String[] args) {
        try{
            test();
        }catch(MyException e){
            Date date = new Date();
            date.setTime(0);
            e.setErrorTime(date);
            System.out.println(e.getErrorTime());
        }
    }
}