package com.example.generics.smartwarehousesystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroceriesTest {
    private Groceries groceries;

    @BeforeEach
    void setUp() {
        groceries = new Groceries("FaceWash", 700, 10);
    }

    @Test
    void testGetQuantity() {
        assertEquals(10, groceries.getQuantity());
    }
}