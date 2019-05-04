package com.mirrors89.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class CalendarExample {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void calendar() {
        Calendar calendar = Calendar.getInstance();

        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);
    }

    @Test
    public void timeZone() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(utc);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(utc);

        System.out.println(format.format(calendar.getTime()));

    }

    @Test
    public void timeZone2() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);

        System.out.println("Time zone: " + timeZone.getID());
        System.out.println("default time zone: " + TimeZone.getDefault().getID());
        System.out.println();

        System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
        System.out.println("Default: " + calendar.getTime());
    }


    @Test
    public void set() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.MAY, 5, 0, 0, 0);

        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }


    @Test
    public void setTime() {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        // 예제를 위한 예제
        date.setMonth(Calendar.MAY);
        date.setDate(5);
        date.setHours(0);
        date.setMinutes(0);

        calendar.setTime(date);

        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }


    @Test
    public void after() {
        Calendar today = Calendar.getInstance();
        Calendar afterDay = Calendar.getInstance();

        afterDay.set(2019, Calendar.MAY, 5, 0, 0, 0);

        System.out.println(today.after(afterDay)); // false
        System.out.println(afterDay.after(today)); // true
    }


    @Test
    public void before() {
        Calendar today = Calendar.getInstance();
        Calendar beforeDay = Calendar.getInstance();

        beforeDay.set(2019, Calendar.MAY, 3, 0, 0, 0);

        System.out.println(today.before(beforeDay)); // false
        System.out.println(beforeDay.before(today)); // true
    }

    @Test
    public void get() {
        Calendar today = Calendar.getInstance();

        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH));
        System.out.println(today.get(Calendar.DAY_OF_MONTH));

        System.out.println(today.get(Calendar.HOUR_OF_DAY));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
    }

    @Test
    public void getActualMinimum() {
        Calendar today = Calendar.getInstance();

        System.out.println("Year : " + today.getActualMinimum(Calendar.YEAR));
        System.out.println("Month : " + today.getActualMinimum(Calendar.MONTH));
        System.out.println("Day : " + today.getActualMinimum(Calendar.DAY_OF_MONTH));

        System.out.println("Hour : " + today.getActualMinimum(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + today.getActualMinimum(Calendar.MINUTE));
        System.out.println("Second : " + today.getActualMinimum(Calendar.SECOND));
    }

    @Test
    public void getActualMaximum() {
        Calendar today = Calendar.getInstance();

        System.out.println("Year : " + today.getActualMaximum( Calendar.YEAR));
        System.out.println("Month : " + today.getActualMaximum(Calendar.MONTH));
        System.out.println("Day : " + today.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("Hour : " + today.getActualMaximum(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + today.getActualMaximum(Calendar.MINUTE));
        System.out.println("Second : " + today.getActualMaximum(Calendar.SECOND));
    }


    @Test
    public void compareTo() {
        Calendar today = Calendar.getInstance();

        Calendar afterDay = Calendar.getInstance();
        afterDay.set(2019, Calendar.MAY, 5, 0, 0, 0);

        Calendar beforeDay = Calendar.getInstance();
        beforeDay.set(2019, Calendar.MAY, 3, 0, 0, 0);

        System.out.println(today.compareTo(beforeDay)); // 1
        System.out.println(today.compareTo(today));     // 0
        System.out.println(today.compareTo(afterDay));  // -1
    }

    @Test
    public void clear() {
        Calendar today = Calendar.getInstance();
        today.clear();

        System.out.println(simpleDateFormat.format(today.getTime()));
    }
}
