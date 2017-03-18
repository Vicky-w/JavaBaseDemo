package com.github.VickyWang.excption;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ExceptionTest01 {
    // 此方法声明了可能在执行时抛出IOException异常，这属于受检异常
    public void test1() throws IOException,SQLException{
        // 当出现某种情况时，会以以下方式抛出一个异常对象
        throw new IOException("磁盘已满");
    }

    // 当在一个方法中调用另一个抛出了受检异常的方法时，这个方法也要对这些受检异常进行处理
    // 处理方式有两种：1：再次抛出；2：内部消化
    // 以下方法属于再次抛出的处理方式，内部消化是使用try-catch-finally块
    public void test2() throws IOException,SQLException{
        test1();
    }

    // 此方法声明了可能在运行过程中抛出Error错误。
    // 这属于非受检异常，一般是程序员不能解决的问题，如网络断开，系统资源故障
    public void test3() throws Error{
        throw new Error("错误-非受检");
    }

    public void test4(){
        test3();
    }

    // 此方法声明了可能在运行过程中抛出的RuntimeException异常。
    // 这属于非受检异常，一般是程序员应该可以修改的问题。不应该由程序处理。
    public void test5() throws RuntimeException{
        throw new RuntimeException("运行时异常-非受检");
    }
    public void test6(){
        test5();
    }

    public static void main(String[] args) throws IOException, SQLException {
        ExceptionTest01 et = new ExceptionTest01();
        et.test1();
        et.test3();
        et.test5();
    }
}