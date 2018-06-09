package com.concurrencypatterns.threadsafety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsafeSequenceTest {

    private UnsafeSequence unsafeSequence;

    @BeforeEach
    void setup() {
        unsafeSequence = new UnsafeSequence();
    }

    @Test
    void getNext() {
        assertEquals(0, unsafeSequence.getNext());
        assertEquals(1, unsafeSequence.getNext());
        assertEquals(2, unsafeSequence.getNext());
    }

}