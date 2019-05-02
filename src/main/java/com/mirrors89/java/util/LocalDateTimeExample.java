package com.mirrors89.java.util;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

    @Test
    public void today() {
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);
    }

    @Test
    public void todayWithZoneId() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));

        System.out.println(now);
    }

    @Test
    public void of() {
        LocalDateTime now = LocalDateTime.of(2019, 5, 5, 0, 0, 0);

        System.out.println(now);
    }

    @Test
    public void parse() {
        LocalDateTime now = LocalDateTime.parse("2019-05-05T00:00:00");

        System.out.println(now);
    }
}
