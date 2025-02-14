package com.example.collections.mapinterface.objectsgrouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployeesByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        // Iterate through the list of employees
        for (Employee employee : employees) {
            String department = employee.getDepartment();

            // If the department is not already in the map, add it with an empty list
            groupedMap.putIfAbsent(department, new ArrayList<>());

            // Add employee to the corresponding department's list
            groupedMap.get(department).add(employee);
        }

        return groupedMap;
    }
}
