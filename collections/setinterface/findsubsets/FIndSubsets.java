package com.example.collections.setinterface.findsubsets;

import java.util.HashSet;

public class FIndSubsets {
    public static boolean findingSubsets(HashSet<Integer>hashSet1,HashSet<Integer>hashSet2){
        boolean isSubset = hashSet2.containsAll(hashSet1);
        System.out.println("The Set-1 is the Subset of Set-2 ? "+isSubset);
        return isSubset;
    }
}
