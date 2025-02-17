package com.annotation.builtinannotation.customannotations;

public class TaskManager {
    @TaskInfo(priority = 1, assignedTo = "Niketa")
    public static void task1() {
        System.out.println("Executing task 1");
    }
}