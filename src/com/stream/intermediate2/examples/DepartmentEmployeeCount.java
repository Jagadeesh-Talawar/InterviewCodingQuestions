package com.stream.intermediate2.examples;

import com.stream.hard.example.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Alice", "Finance", 55000),
                new Employee(3, "Bob", "IT", 609099),
                new Employee(4, "Carol", "Finance", 70000),
                new Employee(5, "David", "HR", 80000),
                new Employee(6, "Eve", "HR", 90000),
                new Employee(7, "Ala", "IT", 100000),
                new Employee(7, "Jaga", "CS", 20000000),
                new Employee(7, "Abhi", "CS", 2000000)
        );

        // Find the department which has the employee count more than 2 times
        // HR = 2, IT = 3, CS=2, FINANCE = 2
        // (HR = 2) (IT = 3), (CS = 2), (FINANCE = 2)

        List<String> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 2)
                                .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());

        System.out.println(result);


    }
}
