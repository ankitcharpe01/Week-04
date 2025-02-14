package com.example.collections.listinterface.reverselist;
import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    //Create a method for reverse a list using ArrayList
    public static List reverseUsingArrayList(List<Integer> list){
        List<Integer>reverse = new ArrayList<>();
        for (int i = list.size()-1; i>=0; i--) {
            reverse.add(list.get(i));
        }
        //return reversed list
        return reverse;
    }

    //Create a method for reverse a list using LinkedList
    public static List reverseUsingLinkedList(List<Integer> list){
        int left=0;
        int right= list.size()-1;
        //Reverse a list using Two pointer approach
        while(left<right){
            int temp = list.get(left);
            list.set(left , list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        //return reversed list
        return list;
    }
}
