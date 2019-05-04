package com.mirrors89.java.api;


import org.junit.Test;

public class WrapperExample {

    @Test
    public void integerCache() {
        // -128 ~ 127
        Integer int1 = 128;
        Integer int2 = 128;

        System.out.println(int1 == int2);
    }

    @Test
    public void newInstance() {
        Integer int1 = 10;
        Integer int2 = new Integer(10);

        System.out.println(int1 == int2);
    }

}
