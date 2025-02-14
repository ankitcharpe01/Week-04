package com.example.collections.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set symmetricDifference(Set<Integer>set1,Set<Integer>set2) {
        Set<Integer>difference = new HashSet<>();
        for (int element : set2) {
            if(!set1.contains(element)){
                difference.add(element);
            }
        }
        for (int element : set1) {
            if(!set2.contains(element)){
                difference.add(element);
            }
        }
        return difference;
    }
}
