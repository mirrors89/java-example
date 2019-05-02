package com.mirrors89.java.util;

import org.junit.Test;

import java.util.Random;

public class RandomExample {


    @Test
    public void random() {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
    }

    @Test
    public void random_같은시드() {
        Random random1 = new Random(100);
        Random random2 = new Random();
        random2.setSeed(100);

        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());

        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());

        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());

        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());
    }

    @Test
    public void random_nextInt() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
    }

    @Test
    public void random_nextLong() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
    }

    @Test
    public void random_nextBoolean() {
        Random random = new Random();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
    }

    @Test
    public void random_nextFloat() {
        Random random = new Random();
        System.out.println(random.nextFloat());
        System.out.println(random.nextFloat());
        System.out.println(random.nextFloat());
        System.out.println(random.nextFloat());
    }

    @Test
    public void random_nextDouble() {
        Random random = new Random();
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());

        System.out.println(Math.random());
        System.out.println(Math.random());
    }

}
