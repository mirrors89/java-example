package com.mirrors89.java.util;

import com.mirrors89.java.exception.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class ObjectsExample {

    @Test
    public void compare() {
        String s1 = "testStr";
        String s2 = new String("testStr");

        int i = Objects.compare(s1, s2, new Comparator<String>() {
            @Override
            public int compare(String s, String anotherString) {
                return s.compareTo(anotherString);
            }
        });
        System.out.println(i);

        //equivalent to
        int i2 = s1.compareTo(s2);
        System.out.println(i2);
    }
    @Test
    public void deepEquals() {
        List<Integer> integers1 = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            integers1.add(i);
            integers2.add(i);
        }

        System.out.println(Objects.deepEquals(integers1, integers2));
    }
    @Test
    public void equals() {
        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println(Objects.equals(object1, object2));

        String string1 = "aaa";
        String string2 = new String("aaa");

        System.out.println(Objects.equals(string1, string2));

    }
    @Test
    public void hash() {
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(Objects.hash(person1, person2));
    }

    @Test
    public void hashcode() {
        Person person = new Person();

        System.out.println(Objects.hashCode(person));
        //equivalent to
        System.out.println(person.hashCode());
    }

    @Test
    public void isNull() {
        Person person = null;

        System.out.println(Objects.isNull(person));
    }
    @Test
    public void nonNull() {
        Person person = new Person();

        System.out.println(Objects.nonNull(person));
    }
    @Test
    public void requireNonNull() {
        Person person = null;

        Person person1 = Objects.requireNonNull(person, () -> "예외가 발생했습니다.");
    }

    @Test
    public void tostring() {
        Person person = new Person();

//        System.out.println(Objects.toString(person));
//        //equivalent to
//        System.out.println(person.toString());


        Person nullPerson = null;
        System.out.println(Objects.toString(nullPerson));
        System.out.println(Objects.toString(nullPerson, "person is null"));


    }
}
