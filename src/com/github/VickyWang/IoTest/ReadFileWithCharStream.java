package com.github.VickyWang.IoTest;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ReadFileWithCharStream {
    public static void main(String[] args) {
        // 声明一个要被读取的文件对象
        File file = new File("c:/test.txt");
        // 声明临时存放文件内容的字符数组
        // file的length方法可以获得文件中的内容字符总数
        char[] charArr = new char[(int)file.length()];

        // 每次读取的字符
        int temp = 0;
        // 读取字符的计数器
        int count = 0;

        Reader r = null;
        try{
            r = new FileReader(file);
            // 使用Reader的read方法可以把文件中的字符逐个读取出来，存入char数组的相应位置上
            // read方法如果返回-1则表示这个文件已经读取结束
            while((temp=r.read())!=-1){
                // 把读取出来的字符编码强制转型成为char类型，放到字符数组的相应位置上
                charArr[count] = (char)temp;
                count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // 释放资源
            if(r!=null){
                try {
                    r.close();
                    r = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String s = new String(charArr);
        System.out.println(s);
    }
}