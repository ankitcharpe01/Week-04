package com.example.collections.setinterface.checkequals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EqualSetsTest {

    @Test
    void equalsets() {
        CheckSetEquals es = new CheckSetEquals();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n = 3;

        for (int i = 0; i < n; i++) {
            set1.add(i+1);
            set2.add(3-i);
        }

        boolean expected = true;
        assertEquals(expected, es.checkEquals(set1, set2));
    }
}