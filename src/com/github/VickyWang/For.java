package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class For {
    public static void main(String[] args) {
        System.out.println("==================== 1到100的和 =======================");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("==================== 1到10的乘积 =======================");

        int r = 1;
        for (int i = 2; i <= 10; i++) {
            r = r * i;
        }
        System.out.println(r);

        System.out.println("==================== 乘法表 =======================");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
