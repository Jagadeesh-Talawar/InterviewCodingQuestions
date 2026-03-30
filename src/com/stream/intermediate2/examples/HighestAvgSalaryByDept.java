package com.stream.intermediate2.examples;

import com.stream.hard.example.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryByDept {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Alice", "Finance", 55000),
                new Employee(3, "Bob", "IT", 609099),
                new Employee(4, "Carol", "Finance", 70000),
                new Employee(5, "David", "HR", 80000),
                new Employee(6, "Eve", "HR", 90000),
                new Employee(7, "Ala", "IT", 100000),
                new Employee(7, "Jaga", "CS", 2000),
                new Employee(7, "Abhi", "CS", 200)
        );

       Map.Entry<String, Double> result =  employees.stream().
               collect(Collectors.groupingBy(Employee::getDepartment,
               Collectors.averagingDouble(Employee::getSalary)))
                       .entrySet().stream()
                       .max(Map.Entry.comparingByValue())
                               .orElseThrow();


        System.out.println(result);

        Map<String, Double>result1 =  employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result1);

       Map.Entry<String, Double> stringDoubleEntry = employees.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(stringDoubleEntry);


    }
}
