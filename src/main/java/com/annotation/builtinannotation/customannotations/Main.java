package com.annotation.builtinannotation.customannotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("task1");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        if (taskInfo != null) {
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}

