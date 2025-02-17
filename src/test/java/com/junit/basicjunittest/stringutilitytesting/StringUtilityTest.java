package com.junit.basicjunittest.stringutilitytesting;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.basicjunittest.stringutilitytesting.StringUtility;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    private final StringUtility obj = new StringUtility();

    @Test
    public void testReverse() {
        assertEquals("olleh", obj.reverse("hello"));
        assertEquals("", obj.reverse(""));
        assertNull(obj.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(obj.isPalindrome("madam") );
        assertFalse(obj.isPalindrome("hello"));
    }

    // Test the toUpperCase method
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", obj.toUpperCase("hello"));
        assertEquals("", obj.toUpperCase("") );
        assertNull(obj.toUpperCase(null));
    }
}