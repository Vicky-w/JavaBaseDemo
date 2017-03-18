package com.github.VickyWang.excption;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ExceptionTest03 {
    public static void test()
            throws SQLException, IOException, CharacterCodingException, ClassNotFoundException, Exception {
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
            case 5:
                throw new Exception("请联系管理员");
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("资源应该在这里释放");
        }
    }

}