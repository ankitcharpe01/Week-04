package com.example.collections.setinterface.unionIntersection;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindUnionAndIntersectionTest {

    ComputeUnionIntersection obj1 = new ComputeUnionIntersection();
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void findUnion() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, obj1.computeUnion(set1, set2));
    }

    @Test
    void findIntersection() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(3));
        assertEquals(expected, obj1.computeIntersection(set1, set2));
    }
}