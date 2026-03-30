package com.stream.intermediate1.examples;

import com.stream.hard.example.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Abhi", "IT", 60000),
                new Employee(1, "Alice", "Finance", 55000),
                new Employee(1, "Bob", "IT", 609099),
                new Employee(4, "Abhi", "Finance", 70000),
                new Employee(4, "David", "HR", 80000),
                new Employee(6, "Eve", "HR", 90000),
                new Employee(7, "Ala", "IT", 100000),
                new Employee(7, "Jaga", "CS", 2000),
                new Employee(1, "Abhi", "CS", 200)
        );

        Map<Integer, String> collect = employees.stream().collect(Collectors.toMap(
                Employee::getId,
                Employee::getName,
                (oldVal, newVal) -> newVal
        ));
        Map<Integer, String> result = collect;

        System.out.println(result);
    }
}
