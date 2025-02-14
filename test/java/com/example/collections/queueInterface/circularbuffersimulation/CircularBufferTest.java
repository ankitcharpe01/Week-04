package com.example.collections.queueInterface.circularbuffersimulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class CircularBufferTest {
    private CircularBuffer buffer;

    @BeforeEach
    void setUp() {
        buffer = new CircularBuffer(5);
    }

    @Test
    void testEnqueueAndDequeue() {
        buffer.enqueue(10);
        buffer.enqueue(20);
        buffer.enqueue(30);

        assertEquals(10, buffer.dequeue());
        assertEquals(20, buffer.dequeue());
        assertEquals(30, buffer.dequeue());
    }

    @Test
    void testCircularBehavior() {
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4);//Overwrite

        assertEquals(1, buffer.dequeue());
        assertEquals(2, buffer.dequeue());
        assertEquals(3, buffer.dequeue());
    }

    @Test
    void testPeek() {
        buffer.enqueue(100);
        assertEquals(100, buffer.peek());
        buffer.enqueue(200);
        assertEquals(100, buffer.peek());
    }

}
