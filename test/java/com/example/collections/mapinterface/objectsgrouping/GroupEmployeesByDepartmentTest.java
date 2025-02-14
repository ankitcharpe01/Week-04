package com.example.collections.mapinterface.objectsgrouping;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GroupObjectByPropertyTest {

    @Test
    void groupsByProperty() {
        Employee e1 = new Employee("Alice", "HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol", "HR");

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3));

        Map<String, List<Employee>> grouped = GroupEmployeesByDepartment.groupByDepartment(employeeList);

        // Expected result
        HashMap<String, List<Employee>> expected = new HashMap<>();
        expected.put("HR", new ArrayList<>(Arrays.asList(e1, e3)));
        expected.put("IT", new ArrayList<>(Arrays.asList(e2)));

        assertEquals(expected, grouped);
    }
}