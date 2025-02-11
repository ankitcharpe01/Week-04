package com.example.generics.dynamiconlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GadgetsTest {
    private Gadgets gadgets;

    @BeforeEach
    public void setUp(){
        gadgets = new Gadgets("Drone",80000.0);
    }

    @Test
    public void testGetName(){
        assertEquals("Drone",gadgets.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals(80000.0,gadgets.getPriceRange());
    }

}