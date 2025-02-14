package com.example.collections.setinterface.checkequals;

import java.util.Set;

public class CheckSetEquals {
    public static boolean checkEquals(Set<Integer> set1, Set<Integer> set2){
        if(set1.size()!= set2.size())
            return false;
        for(int element :set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }
        return true;
    }
}
