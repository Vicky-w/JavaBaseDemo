package com.github.VickyWang.IoTest;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class FileCopyWithCommonsIO {
    public static void main(String[] args) {
        File src = new File("c:/c.png");
        File dest = new File("d:/e.png");
        File srcDir = new File("c:/Dell");
        File destDir = new File("d:/111");

        try {
            FileUtils.copyFile(src, dest);
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}