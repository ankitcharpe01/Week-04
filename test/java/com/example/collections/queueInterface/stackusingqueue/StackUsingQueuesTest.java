package com.example.collections.queueInterface.stackusingqueue;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueueTest {

    StackUsingQueues sq = new StackUsingQueues();
    Stack<Integer> expected = new Stack<>();

    @Test
    void push() {
        sq.push(1);
        sq.push(2);
        expected.push(1);
        expected.push(2);
        assertEquals(expected.peek(), sq.top());
    }

    @Test
    void pop() {
        sq.push(1);
        sq.push(2);
        expected.push(1);
        expected.push(2);
        assertEquals(expected.pop(), sq.pop());
    }

    @Test
    void peek() {
        sq.push(1);
        sq.push(2);
        expected.push(1);
        expected.push(2);
        assertEquals(expected.peek(), sq.top());
    }
}