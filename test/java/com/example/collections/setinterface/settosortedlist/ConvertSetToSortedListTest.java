package com.example.collections.setinterface.settosortedlist;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortedSetTest {
    ConvertSetToSortedList ss = new ConvertSetToSortedList();
    HashSet<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

    @Test
    void sortedSet() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 9));
        assertEquals(expected, ss.convertSetToSortedList(set));
    }
}