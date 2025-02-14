package com.example.collections.listinterface.removeduplicates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class RemoveDuplicatesTest {
    // object creation
    RemoveDuplicates rd = new RemoveDuplicates();

    @Test
    void removeDuplicate() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertEquals(expected, rd.removeDuplicates(list));
    }
}