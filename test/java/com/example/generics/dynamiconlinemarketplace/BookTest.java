package com.example.generics.dynamiconlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book books;

    @BeforeEach
    public void setUp(){
       books = new Book("Data Structures",2050.0);
    }

    @Test
    public void testGetName(){
        assertEquals("Data Structures",books.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals(2050.0,books.getPriceRange());

    }
}