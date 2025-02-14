package com.example.collections.mapinterface.objectsgrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "HR"),
                new Employee("Rahul", "IT"),
                new Employee("Vishal", "HR")
        );
        Map<String, List<Employee>> result = GroupEmployeesByDepartment.groupByDepartment(employees);

        // Print the grouped map
        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
