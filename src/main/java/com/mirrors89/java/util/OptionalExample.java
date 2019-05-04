package com.mirrors89.java.util;

import java.util.Optional;
import java.util.function.Supplier;

import org.junit.Test;

public class OptionalExample {

    @Test
    public void empty() {
        Optional<Object> empty1 = Optional.empty();
        Optional<Object> empty2 = Optional.empty();
        Optional<Object> empty3 = Optional.empty();

        System.out.println(empty1 == empty2);
        System.out.println(empty1 == empty3);

    }

    @Test
    public void of() {
        String notNullString = nullableMethod(false);

        Optional<String> optionalNotNullString = Optional.of(notNullString);

        System.out.println(optionalNotNullString.isPresent());

    }
    @Test
    public void ofWithNull() {
//        Optional<String> optionalNullString = Optional.of(nullableMethod(true));
        Optional<String> optionalNullString = Optional.of(nullableMethod(false));

        System.out.println(optionalNullString.isPresent());

    }

    @Test
    public void ofNullable() {
        String notNullString = nullableMethod(false);
        String nullString = nullableMethod(true);

        Optional<String> optionalNotNullString = Optional.ofNullable(notNullString);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

        System.out.println(optionalNotNullString.isPresent());
        System.out.println(optionalNullString.isPresent());

    }

    @Test
    public void get() {
        String notNullString = nullableMethod(false);
        String nullString = nullableMethod(true);

        Optional<String> optionalNotNullString = Optional.ofNullable(notNullString);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

//        System.out.println(optionalNotNullString.get());
//        System.out.println(optionalNullString.get());
//
        if(optionalNullString.isPresent()) {
            System.out.println(optionalNullString.get());
        } else {
            System.out.println("값이 없고 널이다.");
        }

    }

    @Test
    public void orElse() {
        String nullString = nullableMethod(true);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

        System.out.println(optionalNullString.orElse("값이 없고 널이다."));


        String notNullString = nullableMethod(false);
        Optional<String> optionalNotNullString = Optional.ofNullable(notNullString);

        System.out.println(optionalNotNullString.orElse("값이 없고 널이다."));
    }

    @Test
    public void orElseGet() {
        String nullString = nullableMethod(true);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

        Supplier<String> supplierString = new Supplier<String>() {
            @Override
            public String get() {
                return "값이 없고 널이다.";
            }
        };

        System.out.println(optionalNullString.orElseGet(supplierString));

    }

    @Test
    public void orElseThrow() {
        String nullString = nullableMethod(true);
        Optional<String> optionalNullString = Optional.ofNullable(nullString);

        Supplier<IllegalArgumentException> supplierException = new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException();
            }
        };

        System.out.println(optionalNullString.orElseThrow(supplierException));
    }

    String nullableMethod(boolean isNull) {
        if(isNull) {
            return null;
        }
        return "not null";
    }
}
