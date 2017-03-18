package com.github.VickyWang.IoTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class WriteFileWithCharStream {

    public static void main(String[] args) {
        File file = new File("c:/test.txt");
        if (file.exists() == false) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Writer w = null;
        try {
            // 以替换方式写入字符
            // w = new FileWriter(file);
            // 以追加方式写入字符
            w = new FileWriter(file, true);
            // 向文件中写入内容
            w.write("清华大学在北京");
            // 把要向文件中写入的字符从内存的缓冲区中写入到磁盘的目标文件上
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (w != null) {
                try {
                    w.close();
                    w = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}