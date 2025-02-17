package com.junit.basicjunittest.listoperationtesting;
import static org.junit.jupiter.api.Assertions.*;

import com.junit.basicjunittest.listoperationtesting.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
public class ListManagerTest {

    private final ListManager listManager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        boolean isRemoved = listManager.removeElement(list, 10);
        assertTrue(isRemoved);
        assertEquals(1, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        assertEquals(2, listManager.getSize(list)); // List size should be 2
    }

    @Test
    public void testNullList() {
        List<Integer> list = null;
        listManager.addElement(list, 10);
        assertNull(list);

        boolean isRemoved = listManager.removeElement(list, 10);
        assertFalse(isRemoved);
        assertEquals(-1, listManager.getSize(list));
    }
}