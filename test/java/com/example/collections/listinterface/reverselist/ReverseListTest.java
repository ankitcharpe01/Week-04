package com.example.collections.listinterface.reverselist;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversingTest {

    ReverseList reversing = new ReverseList();

    @Test
    void reverseArrayList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, reversing.reverseUsingArrayList(list));
    }

    @org.junit.jupiter.api.Test
    void reverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, reversing.reverseUsingLinkedList(list));
    }
}