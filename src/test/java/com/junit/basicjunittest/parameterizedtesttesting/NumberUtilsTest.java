package com.junit.basicjunittest.parameterizedtesttesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {4, 6})
    void testIsEvenWithEvenNumber(int number) {
        assertTrue(NumberUtilsTest.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(NumberUtilsTest.isEven(number));
    }
}