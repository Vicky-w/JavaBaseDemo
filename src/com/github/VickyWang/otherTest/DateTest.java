package com.github.VickyWang.otherTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class DateTest {
    public static void main(String[] args) {
        // 取Java中日期开始的那个时间点，因为中国在东8区，所以是：Thu Jan 01 08:00:00 CST 1970
        Date date = new Date(0);
        System.out.println(date);
        // 得当前时间
        date = new Date();
        System.out.println(date);

        // 得当前时间与初始时间之间的毫秒差
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(2015, 0, 1);
        System.out.println(cal);

        date.setTime(cal.getTimeInMillis());
        System.out.println(sdf.format(date));
    }
}
