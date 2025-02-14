package com.example.collections.queueInterface.generatebinarynumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumbersTest {

    GenerateBinaryNumbers bn = new GenerateBinaryNumbers();

    @Test
    void generateBinary() {
        Queue<String> expected = new LinkedList<>(Arrays.asList("1", "10", "11", "100", "101"));
        int n = 5;
        assertEquals(expected, bn.generateBinaryNumbers(5));
    }
}