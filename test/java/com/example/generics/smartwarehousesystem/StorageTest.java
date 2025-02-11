package com.example.generics.smartwarehousesystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StorageTest {
    private Storage<Electronics> storage;
    private Electronics e1;
    private Electronics e2;

    @BeforeEach
    void setUp() {
        storage = new Storage<>();
        e1 = new Electronics("Asus laptop", 2, 55000);
        e2 = new Electronics("DELL laptop", 4, 70999);
        storage.add(e1);
        storage.add(e2);
    }

    @Test
    void testAddItem() {
        assertEquals(2, storage.getList().size());
    }

    @Test
    void testGetList() {
        List<Electronics> list = storage.getList();
        assertTrue(list.contains(e1));
        assertTrue(list.contains(e2));
    }
}
