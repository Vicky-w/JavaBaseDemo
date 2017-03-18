package com.github.VickyWang;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Switch {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int year = 2017;
        int month = 3;
        // switch判断的变量类型可以是：char、byte、short、int、Character、Byte、Short、Integer、枚举类型
        // 从Java 7以后，字符串也可以作为switch判断的变量类型。
        System.out.println("========================= 四季判断 ==========================");
        switch (month) {
            case 2:
            case 3:
            case 4:
                System.out.println("春");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("冬");
                break;
            default:
                System.out.println("请输入正确的月份");
                break;
        }
        System.out.println("========================= 月份天数判断 ==========================");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if (isLeapYear(year)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            default:
                System.out.println("请输入正确的月份。");
        }
    }
}
