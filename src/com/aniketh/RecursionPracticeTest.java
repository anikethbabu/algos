package com.aniketh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionPracticeTest {
    @Test
    void factorial(){
        int n = RecursivePractice.recursiveFactorial(5);
        assertEquals(120,n);
    }

}