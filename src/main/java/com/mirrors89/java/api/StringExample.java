package com.mirrors89.java.api;


import org.junit.Test;

public class StringExample {

    @Test
    public void literal() {
        String a1 = "aaa";
        String a2 = "aaa";

        System.out.println(a1 == a2);
    }

    @Test
    public void instance() {
        String a1 = new String("aaa");
        String a2 = new String("aaa");

        System.out.println(a1 == a2);
    }

    @Test
    public void immutableString() {
        String a1 = "0";

        for(Integer i = 1; i < 10; i++) {
            a1 = a1 + i.toString();
            System.out.println(a1);
            System.out.println("HashCode : " + a1.hashCode());
        }

    }
}
