package com.example.collections.listinterface.rotatelistelements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ElementsRotationTest {

    RotateListElements er = new RotateListElements();

    @Test
    void rotateList() {
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotation = 2;
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        assertEquals(expected, er.rotateListElements(list, rotation));
    }
}