package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 * <p>
 * 计算1到100的偶数和
 */
public class Continue {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
