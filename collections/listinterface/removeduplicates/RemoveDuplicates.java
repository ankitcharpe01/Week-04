package com.example.collections.listinterface.removeduplicates;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static HashSet removeDuplicates(List<Integer>list){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i< list.size();i++) {
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
            }
        }
        return set;
    }
}
