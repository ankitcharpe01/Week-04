package com.example.generics.dynamiconlinemarketplace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product<Book>books;
    private Book b1;
    private Book b2;

    @BeforeEach
    void setUp() {
        books = new Product<>();
        b1 = new Book("Data Structures", 2050.0);
        b2 = new Book("Java", 1550.0);
        books.addProduct(b1);
        books.addProduct(b2);
    }

    @Test
    void testAddItem() {
        assertEquals(2,books.getProducts().size());
    }

    @Test
    void testGetList() {
        List<ProductCategory> list = books.getProducts();
        assertTrue(list.contains(b1));
        assertTrue(list.contains(b2));
    }
}