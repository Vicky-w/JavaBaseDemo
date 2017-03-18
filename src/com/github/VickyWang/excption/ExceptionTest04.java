package com.github.VickyWang.excption;

import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */


public class ExceptionTest04 {
    public static void test() throws SQLException, IOException, CharacterCodingException, ClassNotFoundException {
        Random ran = new Random();
        int num = ran.nextInt(6);
        switch (num) {
            case 1:
                throw new SQLException("数据库操作失败");
            case 2:
                throw new IOException("数据读写异常");
            case 3:
                throw new CharacterCodingException();
            case 4:
                throw new ClassCastException("类未找到");
            default:
                System.out.println("正常执行完成");
                break;
        }
    }

    public static void main(String[] args) {
        // 在捕获多个异常时，应该把更特殊（具体）的异常类的catch块放在前面，更一般（抽象）的异常类的catch块放在后面
        try {
            test();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
