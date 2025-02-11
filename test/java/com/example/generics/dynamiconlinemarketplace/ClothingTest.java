package com.example.generics.dynamiconlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothingTest {
    private Clothing cloths;

    @BeforeEach
    public void setUp(){
       cloths = new Clothing("Shirt",1800.0);
    }

    @Test
    public void testGetName(){
        assertEquals("Shirt",cloths.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals(1800.0,cloths.getPriceRange());

    }
}