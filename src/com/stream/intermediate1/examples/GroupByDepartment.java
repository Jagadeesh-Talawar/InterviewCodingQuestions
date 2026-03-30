package com.stream.intermediate1.examples;

import com.stream.hard.example.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {

        List<com.stream.hard.example.Employee> employees = List.of(
                new com.stream.hard.example.Employee(1, "John", "IT", 60000),
                new com.stream.hard.example.Employee(2, "Alice", "Finance", 55000),
                new com.stream.hard.example.Employee(3, "Bob", "IT", 609099),
                new com.stream.hard.example.Employee(4, "Carol", "Finance", 70000),
                new com.stream.hard.example.Employee(5, "David", "HR", 80000),
                new com.stream.hard.example.Employee(6, "Eve", "HR", 90000),
                new com.stream.hard.example.Employee(7, "Ala", "IT", 100000),
                new com.stream.hard.example.Employee(7, "Jaga", "CS", 2000),
                new Employee(7, "Abhi", "CS", 200)
        );

        Map<String, Double> result =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));


        System.out.println(result);

    }
}
