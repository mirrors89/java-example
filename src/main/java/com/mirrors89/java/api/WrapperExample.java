package com.mirrors89.java.api;


import org.junit.Test;

public class WrapperExample {

    @Test
    public void integerCache() {
        Integer int1 = 127;
        Integer int2 = 127;

        System.out.println(int1 == int2);
    }

    @Test
    public void newInstance() {
        Integer int1 = 10;
        Integer int2 = new Integer(10);

        System.out.println(int1 == int2);
    }

    @Test
    public void ss() {
        Double double1 = 1D;
        Double double2 = 1D;

        System.out.println(double1 == double2);
    }

}
