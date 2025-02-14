package com.example.collections.mapinterface.highestvalue;

import java.util.Map;

public class HighestValue {
    public static String findKeyWithMaximumValue(Map<String,Integer> map){
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
