package com.junit.basicjunittest.stringutilitytesting;

public class StringUtility {
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
