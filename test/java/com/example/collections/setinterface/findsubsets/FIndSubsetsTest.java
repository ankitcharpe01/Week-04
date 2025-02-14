package com.example.collections.setinterface.findsubsets;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class FindSubsetTest {
    FIndSubsets fs = new FIndSubsets();
    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

    @Test
    void findSubset() {
        boolean expected = true;
        assertEquals(expected, fs.findingSubsets(set1, set2));
    }
}