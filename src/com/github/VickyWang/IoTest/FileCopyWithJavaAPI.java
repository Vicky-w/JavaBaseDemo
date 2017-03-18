package com.github.VickyWang.IoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class FileCopyWithJavaAPI {
    public static void main(String[] args) {
        File src = new File("c:/c.png");
        File dest = new File("d:/d.png");

        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dest)) {
            // 准备一个装文件字节的数组
            byte[] bytes = new byte[in.available()];
            // 把源文件的内容读取到这个数组中
            in.read(bytes);
            // 把内容写入到目标文件中
            out.write(bytes);
            // 如果要完成的功能是移动文件，需要删除源文件
            // src.delete();
            System.out.println("copy 完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}