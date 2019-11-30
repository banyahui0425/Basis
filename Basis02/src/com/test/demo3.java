package com.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:28
 * @Description Calendar
 */
public class demo3 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int weekYear = calendar.getWeekYear();
        System.out.println("weekYear = " + weekYear);

        Date time = calendar.getTime();
        System.out.println("time = " + time);
    }
}
