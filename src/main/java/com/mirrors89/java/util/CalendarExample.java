package com.mirrors89.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.Test;

public class CalendarExample {
    @Test
    public void calendar() {
        Calendar instance = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        String format = simpleDateFormat.format(instance.getTime());
        System.out.println(format);
    }
}
