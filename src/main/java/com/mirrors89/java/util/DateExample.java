package com.mirrors89.java.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    @Test
    public void today() {
        Date today = new Date();

        System.out.println(today);
    }

    @Test
    public void todayFormat() {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String formatDate = simpleDateFormat.format(today);

        System.out.println(formatDate);
    }

    @Test
    public void after() {
        Date today = new Date();

        Date afterDay = new Date();
        afterDay.setHours(afterDay.getHours() + 1);

        System.out.println(today.after(afterDay)); // false
        System.out.println(afterDay.after(today)); // true
    }


    @Test
    public void before() {
        Date today = new Date();

        Date beforeDay = new Date();
        beforeDay.setHours(beforeDay.getHours() - 1);

        System.out.println(today.before(beforeDay)); // false
        System.out.println(beforeDay.before(today)); // true
    }

    @Test
    public void compareTo() {
        Date today = new Date();

        Date beforeDay = new Date();
        beforeDay.setHours(beforeDay.getHours() - 1);

        Date afterDay = new Date();
        afterDay.setHours(afterDay.getHours() + 1);

        System.out.println(today.compareTo(beforeDay));
        System.out.println(today.compareTo(today));
        System.out.println(today.compareTo(afterDay));
    }

    @Test
    public void time() {
        Date today = new Date();

        System.out.println(today.getTime());
        today.setTime(100000);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formatDate = simpleDateFormat.format(today);
        System.out.println(formatDate);
    }
}
