package com.example.collections.mapinterface.invertamap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertAMap {
        public static Map<Integer, List<String>> invertMap (Map<String, Integer > inputMap){
            Map<Integer, List<String>> invertedMap = new HashMap<>();
            for (Map.Entry<String, Integer> entry : inputMap.entrySet()) { // Iterate through the input map
                Integer value = entry.getValue(); // Get the value
                String key = entry.getKey(); // Get the key
                if (!invertedMap.containsKey(value)) { // Check if the value is already in the result map
                    invertedMap.put(value, new ArrayList<>()); // If not, add it with an empty list
                }
                invertedMap.get(value).add(key);
            }
            return invertedMap;
        }

}
