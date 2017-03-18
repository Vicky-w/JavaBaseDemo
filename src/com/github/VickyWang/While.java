package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class While {
    public static void main(String[] args) {
        System.out.println("================= 1到100的和 ===============");
        int sum = 0;// 累加的和
        int i = 1;// 加数（计数器）
        while (i <= 100) {
            sum = sum + i;// 进行累加操作
            i++;// 把加数自增1
        }
        System.out.println(sum);
        System.out.println("================= 1到10的阶乘之和 (使用while嵌套)===============");
        int result = 0;// 结果
        i = 1;// 阶乘基数
        while (i <= 10) {
            int j = 1;// 阶乘起始值
            sum = 1;// 阶乘的结果变量
            while (j <= i) {
                sum = sum * j;
                j++;
            }
            i++;
            result = result + sum;
        }
        System.out.println(result);
        System.out.println("=================  1到10的阶乘之和 (不使用while嵌套) ===============");
        result = 1;// 累加结果
        sum = 1;// 阶乘
        i = 2;// 乘数
        while (i <= 10) {
            sum = sum * i;// 计算阶乘
            result = result + sum;// 累加阶乘之和
            i++;// 计数器累加
        }
        System.out.println(result);
        System.out.println("================= 计算题 ===============");
        int q = 1020;// 西瓜剩余的数量
        int day = 0;// 天数
        while (q > 0) {
            q = q / 2 - 2;// 计算每天的剩余量
            day++;// 天数累加
        }
        System.out.println(day);
    }
}
