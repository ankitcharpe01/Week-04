package com.example.collections.setinterface.symmetricdifference;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    SymmetricDifference obj = new SymmetricDifference();
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void findSymmetricDifference() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, obj.symmetricDifference(set1, set2));
    }
}