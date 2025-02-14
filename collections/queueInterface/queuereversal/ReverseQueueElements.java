package com.example.collections.queueInterface.queuereversal;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueElements {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
