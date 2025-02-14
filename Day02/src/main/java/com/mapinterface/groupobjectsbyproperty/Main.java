package com.mapinterface.groupobjectsbyproperty;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("Dave", "Finance")
        );

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);

        // Display result
        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
