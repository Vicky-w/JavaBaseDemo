package com.github.VickyWang.IoTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ReadFileWithByteStream {
    public static void main(String[] args) {
        File file = new File("c:/test.txt");

        // 文件内容的放置数组，文件的每一个字节会按顺序放入这个数组的各个元素中
        byte[] byteArr = null;
        try(InputStream in = new FileInputStream(file)){
            // 实例化了一个字节数组对象，容量是文件流的长度
            byteArr = new byte[in.available()];
            // 从流中把文件的字节内容读取到字节数组中。
            in.read(byteArr);
        }catch(IOException e){
            e.printStackTrace();
        }
        String s = new String(byteArr);
        System.out.println(s);
    }
}
