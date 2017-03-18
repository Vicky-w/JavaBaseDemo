package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 * <p>
 * 这是Hello World的Java类
 * 这是JavaDoc注释
 */
public class HelloWorld {
    /**
     * 这是HelloWorld类的主方法
     */
    public static void main(String[] args) {
        // 这是一个单行注释，以下语句用于在控制台上输出一些文本
        System.out.println("Hello World!");
        /*
		 * 这是一段多行的注释
		 * 以下输出一个分隔线
		 * JavaDoc注释和多行注释是不能嵌套使用的
		 */
        System.out.println("======================================");
    }
}
// 在一个源代码文件中可以定义多个class，但最多只能有一个class可以是public的
// 这个public的class的名字一定要和其所在的源代码文件的文件名完全一致。
// 不推荐在一个源代码文件中定义多个class的这种做法

class Abc {

}