package com.mapinterface.groupobjectsbyproperty;

import java.util.*;

public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedEmployees = new HashMap<>();

        for (Employee emp : employees) {
            groupedEmployees
                    .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                    .add(emp);
        }

        return groupedEmployees;
    }
}
