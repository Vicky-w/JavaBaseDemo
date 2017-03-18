package com.github.VickyWang;

import java.util.Date;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("======================== 基础 ========================");
        System.out.println("========================  ========================");
        String s1 = new String("abc");
        String s2 = new String("abc");
        // 判断s1和s2是否引用了相同的对象（判断相同）
        System.out.println(s1 == s2);
        // 判断s1和s2的引用对象的内容是否相等（判断相等）
        System.out.println(s1.equals(s2));

        // 使用字面量的字符串对象为字符串变量赋值时，字符串对象会在串池中共享
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

        s3 = s3 + s4;
        System.out.println("======================== 空 ========================");
        s1 = "Tom";
        String s1Upper = s1.toUpperCase();
        String s1Lower = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s1Upper);
        System.out.println(s1Lower);

        System.out.println(s1.contains("To"));
        System.out.println(s1.contains("ow"));

        System.out.println("This is an apple.".indexOf("s"));
        System.out.println("This is an apple.".lastIndexOf("s"));
        System.out.println("This is an apple.".indexOf("apples"));
        System.out.println("This is an apple.".lastIndexOf("apples"));

        System.out.println("This is an apple.".length());

        s2 = "";// 空串：s2有引用的对象，但这个对象的内容是一个空的字符串。这与null有本质上的区别。null表示一个引用变量没有引用任何对象。
        System.out.println(s2.isEmpty());
        s3 = null;
//         System.out.println(s3.isEmpty());// 会抛出空指针异常

        System.out.println("This is an apple.".replace("s", "z"));
        System.out.println("This is an apple.".replace("is", "zz"));

        System.out.println("This is an apple.".substring(5));
        System.out.println("This is an apple.".substring(5, 7));

        System.out.println("      I am a student.      ");
        System.out.println("      I am a student.      ".trim());

        int i = 100;
        System.out.println(String.valueOf(i));
        System.out.println("" + i);
        System.out.println("======================== 进制 ========================");
        System.out.println("Number: 5");
        System.out.println("Number: 55");
        System.out.println(String.format("Number: %d", 5));
        System.out.println(String.format("Number: %d", 55));
        System.out.println(String.format("%d+%d=%d", 5, 5, (5 + 5)));

        // %x：十六进制整数
        System.out.println(String.format("%x", 15));
        // %o：八进制整数
        System.out.println(String.format("%o", 15));
        // %f：十进制的浮点数
        System.out.println(String.format("%f", 15.386));
        System.out.println(String.format("%.2f", 15.386));
        // %e：科学计数法
        System.out.println(String.format("%e", 15.386));
        // %g：通用浮点数
        System.out.println(String.format("%g", 15.386));
        // %a：十六进制浮点数
        System.out.println(String.format("%a", 15.386));
        // %s：字符串
        System.out.println(String.format("String: %s", "abc123"));
        // %c：字符 %b：boolean
        System.out.println(String.format("Char: %c, Boolean %b", '\u0932', true));

        System.out.println(new Date());
        // 日期字符串的格式：y：两位的年;Y：四位的年;m：两位的月;d：两位的日期
        System.out.println(String.format("Today is: %tc", new Date()));
        System.out.println(String.format("Today is: %tF", new Date()));
        System.out.println(String.format("Today is: %tD", new Date()));
        System.out.println(String.format("Today is: %tY", new Date()));
        System.out.println(String.format("Today is: %tm", new Date()));
        System.out.println(String.format("Today is: %td", new Date()));

        System.out.println(String.format("25%%"));
        // %n表示一个换行
        System.out.println(String.format("这是一行。%n这是一个新行。"));

        System.out.println(String.format("我是%s,今年%d岁了。", "张三丰",358));
        System.out.println(String.format("我是%2$s,今年%1$d岁了。", 358,"张三丰"));

        System.out.printf("我是%2$s,今年%1$d岁了。", 358,"张三丰");
    }
}
