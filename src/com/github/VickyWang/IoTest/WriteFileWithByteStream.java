package com.github.VickyWang.IoTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class WriteFileWithByteStream {
    public static void main(String[] args) {
        // 目标文件
        File file = new File("c:/test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (OutputStream out = new FileOutputStream(file)) {
            String s1 = "君不见黄河之水天上来\r\n";
            String s2 = "奔流到海不复回";
            // 把要写入的字符转换成为字节数组
            byte[] bs1 = s1.getBytes();
            byte[] bs2 = s2.getBytes();
            // 写入
            out.write(bs1);
            out.write(bs2);
            System.out.println("写入完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
