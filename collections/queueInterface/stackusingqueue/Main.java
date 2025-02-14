package com.example.collections.queueInterface.stackusingqueue;

public class Main {
    public static void main(String[] args) {
            StackUsingQueues stack = new StackUsingQueues();

            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Pop element: "+stack.pop());
            System.out.println("Top element: "+stack.top());
        }
    }
