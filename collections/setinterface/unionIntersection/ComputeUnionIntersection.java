package com.example.collections.setinterface.unionIntersection;

import java.util.HashSet;
import java.util.Set;

public class ComputeUnionIntersection {
    public static Set computeUnion(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
      return union;
    }

    public static Set computeIntersection(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>intersection = new HashSet<>();
        for(int element :set1) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }
}
