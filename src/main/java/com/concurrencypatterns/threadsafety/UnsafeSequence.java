package com.concurrencypatterns.threadsafety;

public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
