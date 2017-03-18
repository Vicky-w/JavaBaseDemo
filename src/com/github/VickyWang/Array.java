package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println("========================== 基础使用 =========================");
        int[] a1 = new int[5];
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);
        System.out.println(a1[3]);
        System.out.println(a1[4]);
        a1[0] = 100;
        a1[1] = 110;
        a1[2] = 120;
        a1[3] = 130;
        a1[4] = 140;
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);
        System.out.println(a1[3]);
        System.out.println(a1[4]);

        // 数组的index范围是从0到其长度-1范围内的正整数
        // 以下用法超出了这个范围，所以会抛出数组index越界异常
        // System.out.println(a1[5]);
        // System.out.println(a1[-1]);

        int[] a2 = new int[10];
        // 用传统的for(index方式)对a2数组进行遍历赋值
        for (int i = 0; i < a2.length; i++) {
            a2[i] = 10;
        }
        // 使用增加for循环（Java1.5以后出现）对a2数组的元素进行逐个读取
        // 冒号前的部分是当前循环中要被遍历的数组中的那个元素（当前要被处理的元素）
        // 冒号后的部分是要被遍历的数组（还有可能是List或Set）
        for (int element : a2) {
            System.out.println(element);
        }

        int[] a3 = {1,3,568,382,392,3,214};
        int[] a4 = new int[]{1,3,568,382,392,3,214};
        System.out.println("========================== 遍历 =========================");
        int[] a5 = new int[10];
        // 通常使用index进行for循环遍历，是对数组进行初始值的设置
        for (int i = 0; i < a5.length; i++) {
            a5[i]=5*(i+1);
        }
        // 对数组的每个元素进行修改或读取时通常使用增强for循环
        for (int e : a5) {
            System.out.println(e);
        }
        System.out.println("========================== 二维数组 =========================");
        int[][] a = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }
        for (int[] is : a) {
            for (int i : is) {
                System.out.println(i);
            }
        }
        int[][] b1 = { { 3, 68, 32, 68 }, { 38, 38, 38, 23 }, { 38, 28, 18, 49 } };
        int[][] b2 = new int[][] { { 3, 68, 32, 68 }, { 38, 38, 38, 23 }, { 38, 28, 18, 49 } };
        int[][] b3 = new int[][] { { 3, 68, 32 }, { 38, 38, 38, 23, 678, 327, 59 }, { 38, 28, 18, 49 } };
    }
}
