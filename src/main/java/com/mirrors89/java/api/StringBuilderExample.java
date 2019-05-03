package com.mirrors89.java.api;


import org.junit.Test;

public class StringBuilderExample {

    @Test
    public void builder() {
        StringBuilder stringBuilder = new StringBuilder(32);

        for(int i = 0; i < 10; i++) {
            stringBuilder.append(i);
            System.out.println(stringBuilder.toString());
            System.out.println("HashCode : " + stringBuilder.hashCode());
        }
    }

    @Test
    public void equal() {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            stringBuilder1.append(i);
            stringBuilder2.append(i);
        }

        System.out.println(stringBuilder1.equals(stringBuilder2));
    }
}
