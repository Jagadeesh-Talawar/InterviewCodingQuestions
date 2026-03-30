package com.test.examples.practice;

import com.stream.hard.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CodingPractice {
    public static void main(String[] args) {

        List<com.stream.hard.example.Employee> employees = List.of(
                new com.stream.hard.example.Employee(1, "John", "IT", 60000),
                new com.stream.hard.example.Employee(2, "Alice", "Finance", 55000),
                new com.stream.hard.example.Employee(3, "Bob", "HR", 609099),
                new com.stream.hard.example.Employee(4, "Carol", "Automation", 70000),
                new com.stream.hard.example.Employee(5, "David", "IT", 80000),
                new com.stream.hard.example.Employee(6, "Eve", "Finance", 90000),
                new com.stream.hard.example.Employee(7, "Ala", "HR", 100000),
                new com.stream.hard.example.Employee(7, "Jaga", "Automation", 20000000),
                new Employee(7, "Abhi", "IT", 2000000)
        );

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalary);

        Employee emp = employees.stream().max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println(emp);

        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                ));

        System.out.println(collect);

        Map<String, Optional<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        System.out.println(collect1);

       Map<String, Long> result2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(result2);

        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .get();

        System.out.println(employee);

        String key = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(key);

        List<String> names = Arrays.asList("Jagadesh", "Abhishek");
        List<Character> result = names.stream().flatMap(c -> c.chars().mapToObj(word -> (char) word)).collect(Collectors.toList());
        System.out.println(result);

        Employee employee1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();

        System.out.println(employee1);
    }
}
