package com.mirrors89.java.util;

import java.util.Optional;
import org.junit.Test;

public class OptionalExample {

    @Test
    public void empty() {
        Optional<Object> empty1 = Optional.empty();
        Optional<Object> empty2 = Optional.empty();
        Optional<Object> empty3 = Optional.empty();

        System.out.println(empty1.isPresent());
        System.out.println(empty1 == empty2);
        System.out.println(empty1 == empty3);

    }

    @Test
    public void of() {
        String emptyString = "";

        Optional<String> optionalEmptyString = Optional.of(emptyString);

        System.out.println(optionalEmptyString.isPresent());

    }
    @Test
    public void ofWithNull() {
        String nullString = null;

        Optional<String> optionalNullString = Optional.of(nullString);

        System.out.println(optionalNullString.isPresent());

    }

    @Test
    public void ofNullable() {
        String emptyString = "";
        String nullString = null;

        Optional<String> optionalEmptyString = Optional.ofNullable(emptyString);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

        System.out.println(optionalEmptyString.isPresent());
        System.out.println(optionalNullString.isPresent());

    }

    @Test
    public void isPresent() {

    }

    @Test
    public void get() {

    }

    @Test
    public void orElse() {

    }

    @Test
    public void orElseGet() {

    }

    @Test
    public void orElseThrow() {

    }

    String nullableMethod(boolean isNull) {
        if(isNull) {
            return null;
        }

        return "";

    }
}
