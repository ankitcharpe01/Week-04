package com.example.generics.smartwarehousesystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ElectronicsTest {
    private Electronics electronics;

    @BeforeEach
    void setUp() {
        electronics = new Electronics("Asus laptop", 55000, 2);
    }

    @Test
    void testGetName() {
        assertEquals("Asus laptop", electronics.getName());
    }

    @Test
    void testGetQuantity() {
        assertEquals(2, electronics.getQuantity());
    }

    @Test
    void testGetPrice() {
        assertEquals(55000, electronics.getPrice());
    }
}
