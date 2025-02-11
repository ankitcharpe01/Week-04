package com.example.generics.smartwarehousesystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FurnitureTest {
    private Furniture furniture;

    @BeforeEach
    void setUp() {
        furniture = new Furniture("Table", 3, 2099);
    }

    @Test
    void testGetName() {
        assertEquals("Table", furniture.getName());
    }
}
