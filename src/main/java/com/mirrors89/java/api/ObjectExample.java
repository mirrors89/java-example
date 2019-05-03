package com.mirrors89.java.api;


import org.junit.Test;

public class ObjectExample {

    @Test
    public void equal() {
        Object object1 = new Object();
        Object object2 = object1;

        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));

        Object object3 = new Object();
        System.out.println(object1.equals(object3));
        
    }

    @Test
    public void hashcode() {
        Object object1 = new Object();
        Object object2 = object1;


        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());

        Object object3 = new Object();
        System.out.println(object3.hashCode());

    }

    @Test
    public void tostring() {
        Object object1 = new Object();
        Object object2 = object1;


        System.out.println(object1.toString());
        System.out.println(object2.toString());

        Object object3 = new Object();
        System.out.println(object3.toString());
    }
}
