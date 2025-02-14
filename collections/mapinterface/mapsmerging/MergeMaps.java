package com.example.collections.mapinterface.mapsmerging;


import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>();

        // Add all entries from the first map to the merged map
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }
        // Add entries from the second map to the merged map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, mergedMap.get(key) + value);
            } else {
                // If the key does not exist, add it to the merged map
                mergedMap.put(key, value);
            }
        }

        return mergedMap;
    }
}