package com.example.collections.mapinterface.highestvalue;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KeyWithHighestValueTest {

    @Test
    void maxKeyValue() {
        // Set up test data
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Expected output
        String expectedOutput = "B";

        String result = HighestValue.findKeyWithMaximumValue(inputMap);

        // Assert the output
        assertEquals(expectedOutput, result);
    }
}