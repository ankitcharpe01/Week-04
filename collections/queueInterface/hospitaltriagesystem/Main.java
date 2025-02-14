package com.example.collections.queueInterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient>priorityQueue = new PriorityQueue<>();
        Patient patient ;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Enter Patient Name:_____.until not entered exit");
            String name = sc.next();
            if(name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter Patient Priority: ");
            int priority = sc.nextInt();
            patient = new Patient(name,priority);
            priorityQueue.add(patient);
        }while(true);
        System.out.println("Priority Queue is: ");
        System.out.println(priorityQueue);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek().getName()+" - "+ priorityQueue.remove().getPriority());
        }
    }
}
