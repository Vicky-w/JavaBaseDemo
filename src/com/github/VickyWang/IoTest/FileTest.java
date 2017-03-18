package com.github.VickyWang.IoTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class FileTest {
    public static void main(String[] args) throws IOException {
        // File file= new File("c:\\abc.txt");
        // File file = new File("c:" + File.separator + "abc.txt");
        File file = new File("c:/123.txt");
        File file2 = new File("c:/abc.txt");
        File dir = new File("c:/123/a");
        System.out.println(file.exists());
        System.out.println(dir.exists());

        if (!file.exists()) {
            file.createNewFile();
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }

        System.out.println("文件名：" + file.getName());
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的最后修改时间：" + new Date(file.lastModified()));
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否是隐藏文件：" + file.isHidden());
        System.out.println("是否是可执行文件：" + file.canExecute());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());

        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }
        dir.delete();
    }
}