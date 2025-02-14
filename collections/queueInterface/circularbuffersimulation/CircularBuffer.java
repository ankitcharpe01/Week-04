package com.example.collections.queueInterface.circularbuffersimulation;

public class CircularBuffer {
    private int [] queue;
    private int front, rear, size,capacity;

    public CircularBuffer(int capacity) {
        this.capacity=capacity;
        this.queue = new int[capacity];
        front = 0;
        rear = 0;
        this.size = 0;
    }

    public void enqueue(int data) {
        queue[rear]=data;
        rear=(rear+1)%capacity;
        if(size<capacity){
            size++;
        }else{
            front=(front+1)%capacity;
        }
    }

    public int dequeue() {
        if (front == -1)
            throw new RuntimeException("QueueUnderflow...");
        int x = queue[front];
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % capacity;
        return x;
    }

    public boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        return queue[front];
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
