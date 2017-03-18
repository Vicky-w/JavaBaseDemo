package com.github.VickyWang.excption;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ExceptionTest02 {
    public void test1() throws IOException, SQLException {
        throw new IOException("磁盘已满");
    }

    public void test2() throws Error {
        throw new Error("错误-非受检");
    }

    public void test3() throws RuntimeException {
        throw new RuntimeException("运行时异常-非受检");
    }

    public static void main(String[] args) {
        ExceptionTest02 et = new ExceptionTest02();
        et.test2();
        et.test3();

        // 调用test1方法时，因为可能会抛出受检异常，所在我们要显式的处理它们。
        // try块会尝试着执行test1方法，如果没有发生异常，则会在test1调用完成后执行finally块中的语句
        // catch块用于捕获各种异常，当某个异常发生时，与其对应的catch块中的代码就会执行，执行完成后，会执行finally块中的语句
        // finally块中的语句无论异常是否发生，都会执行，通常用于系统资源的释放。
        // try块如果出现，至少要在其后跟一个catch块，也可能是多个catch块，finally块是可选的，可以有零或一个
        try {
            et.test1();
        } catch (IOException e) {
            // 可以进行中间数据的暂存，日志的记录，以及其它一些挽救措施
            e.printStackTrace();
        } catch (SQLException e) {
            // 可以进行中间数据的暂存，日志的记录，以及其它一些挽救措施
            e.printStackTrace();
        } finally {
            // 释放资源
            System.out.println("无论异常是否发生，finally块中的语句都会被执行");
        }
    }
}
