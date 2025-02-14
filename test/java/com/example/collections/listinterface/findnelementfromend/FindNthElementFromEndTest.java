package com.example.collections.listinterface.findnelementfromend;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;

class FindNthElementTest {
    FindNthElementFromEnd fe = new FindNthElementFromEnd();

    @Test
    void findElement() {
        LinkedList<String> list = new LinkedList(Arrays.asList("A","B","C","D","E"));
        int n = 2;
        String expected = "D";
        assertEquals(expected, fe.findNthFromLast(list, n));
    }
}