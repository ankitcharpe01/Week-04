package com.example.collections.mapinterface.invertamap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InvertAMapTest {

    @Test
    void invertMap() {
        HashMap<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Expected output
        HashMap<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, new ArrayList<>());
        expectedOutput.put(2, new ArrayList<>());
        expectedOutput.get(1).add("A");
        expectedOutput.get(2).add("B");
        expectedOutput.get(1).add("C");

        Map<Integer, List<String>> result = InvertAMap.invertMap(inputMap);

        assertEquals(expectedOutput, result);
    }
}