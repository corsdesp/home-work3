package com.epam.training.int_util.Predicate;

public class Negative implements Predicate {
    @Override
    public boolean check(int value) {
        return value < 0;
    }
}
