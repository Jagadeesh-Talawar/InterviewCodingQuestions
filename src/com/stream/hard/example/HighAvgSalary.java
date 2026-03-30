package com.stream.hard.example;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighAvgSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Alice", "Finance", 55000),
                new Employee(3, "Bob", "IT", 609099),
                new Employee(4, "Carol", "Finance", 70000),
                new Employee(5, "David", "HR", 80000),
                new Employee(6, "Eve", "Manager", 90000),
                new Employee(7, "Ala", "HR", 100000),
                new Employee(7, "Jaga", "Manager", 20000000),
                new Employee(7, "Abhi", "HR", 2000000)
        );

       Optional<Map.Entry<String, Double>>  collect = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue());
        System.out.println(collect);

        Map<Boolean, List<Employee>> collect1 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));

        System.out.println(collect1);

        Map<String, Optional<Employee>> ans = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
        ));

        System.out.println(ans);

        String collect2 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
        ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(collect2);


    }
}
