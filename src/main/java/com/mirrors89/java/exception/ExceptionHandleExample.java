package com.mirrors89.java.exception;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandleExample {

    @Test
    public void checkedException() {
        try {
            PrintWriter printWriter = new PrintWriter("./test.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void uncheckedException() {
        Person person = null;
        person.setName("이름입니다.");
    }


    @Test
    public void 예외_복구() {
        Person person = null;

        try {
            person.setName("이름입니다.");

        } catch (NullPointerException e) {
            System.out.println("널 예외가 발생했습니다.");

            person = new Person();
            person.setName("Default");

            System.out.println(person.getName());
        } catch (IndexOutOfBoundsException e) {


        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
            e.printStackTrace();
        }
    }

    @Test
    public void 예외처리_회피1() {
        Person person = null;

        try {
            person.setName("이름입니다.");

        } catch (NullPointerException e) {
            throw e;
        }
    }

    @Test
    public void 예외처리_회피2() throws NullPointerException {
        Person person = null;
        person.setName("이름입니다.");
    }



    @Test
    public void 예외_전환() {
        Person person = null;

        try {
            person.setName("이름입니다.");

        } catch (NullPointerException e) {
            throw new IllegalArgumentException("예외가 발생했습니다.");
        }
    }


}
