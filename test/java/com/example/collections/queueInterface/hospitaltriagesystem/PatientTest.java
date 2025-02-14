package com.example.collections.queueInterface.hospitaltriagesystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;

public class PatientTest {
    private PriorityQueue<Patient> priorityQueue;

    @BeforeEach
    void setUp() {
        priorityQueue = new PriorityQueue<>();
    }

    @Test
    void testPatientEnqueueAndDequeue() {
        Patient p1 = new Patient("Alice", 2);
        Patient p2 = new Patient("Bob", 3);
        Patient p3 = new Patient("Charlie", 1);

        priorityQueue.add(p1);
        priorityQueue.add(p2);
        priorityQueue.add(p3);

        assertEquals("Bob", priorityQueue.poll().getName()); // Highest priority
        assertEquals("Alice", priorityQueue.poll().getName());
        assertEquals("Charlie", priorityQueue.poll().getName());
    }

    @Test
    void testEmptyQueue() {
        assertTrue(priorityQueue.isEmpty());
    }
}
