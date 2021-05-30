package com.rosyidgrobogan.springcreationalpatterns.singleton;

public class CounterSolution {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }
}
