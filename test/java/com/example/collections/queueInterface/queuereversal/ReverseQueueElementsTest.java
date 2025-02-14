package com.example.collections.queueInterface.queuereversal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    ReverseQueueElements rq = new ReverseQueueElements();

    @Test
    void reverseQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(30, 20, 10));

        rq.reverseQueue(queue);
        assertEquals(expected, queue);
    }
}