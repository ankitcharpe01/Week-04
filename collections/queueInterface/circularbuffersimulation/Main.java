package com.example.collections.queueInterface.circularbuffersimulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter buffer size: ");
        int size = sc.nextInt();
        CircularBuffer queue = new CircularBuffer(size);
        int choice;
        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1.Insert element\n2.Delete element\n3.Peek Element\n4.exit\n5.Display details");
            choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Queue Element:");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    int dequeueElement = queue.dequeue();
                    System.out.println("Dequeued Element: " + dequeueElement);
                    break;
                case 3:
                    System.out.println("Peek Element is:" + queue.peek());
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Display elements");
                    queue.display();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
        }while(choice!=4);
    }
}

