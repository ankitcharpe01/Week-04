package com.example.collections.listinterface.findnelementfromend;
import java.util.Iterator;
import java.util.LinkedList;

public class FindNthElementFromEnd {
    public static String findNthFromLast(LinkedList<String>list, int position) {
        int i = 0;
        String element=null;
        Iterator<String> it = list.descendingIterator();
        while (i < position) {
            element=it.next();
            i++;
        }
        return element;
    }
}
