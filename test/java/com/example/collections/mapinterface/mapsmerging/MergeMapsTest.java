package com.example.collections.mapinterface.mapsmerging;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MergingMapsTest {

    @Test
    void mergeTwoMaps() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Expected merged map
        HashMap<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("A", 1);
        expectedOutput.put("B", 5);
        expectedOutput.put("C", 4);

        Map<String, Integer> result = MergeMaps.mergeMaps(map1, map2);

        assertEquals(expectedOutput, result);
    }
}