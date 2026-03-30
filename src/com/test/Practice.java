package com.test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practice {
    public static void main(String[] args) {

       List<Employee> employees = Arrays.asList(
                new Employee("John",1,60000,"HR", LocalDate.of(2023,5,10)),
                new Employee("Sam",2,50000,"IT", LocalDate.of(2024,2,15)),
                new Employee("David",3,75000,"Finance", LocalDate.of(2022,8,20)),
                new Employee("Mike",4,65000,"IT", LocalDate.of(2024,1,5)),
                new Employee("Sam",5,50000,"Engineering", LocalDate.of(2024,2,15))




        );

        Employee employee = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(employee);

        System.out.println(employee.getName());

        Map<String, Double> collect =
                employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ));

        System.out.println(collect);

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        List<Employee> list = employees.stream().filter(e -> e.getJoiningDate().isAfter(oneYearAgo)).toList();

        System.out.println(list);


       String dept =  employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
        ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(dept);

      employees.stream().sorted(Comparator.comparing(Employee::getDepartment).
                thenComparing(Employee::getSalary)).forEach(System.out::println);


      List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

      List<Integer> result = numbers.stream().filter( n -> n%2 == 0).collect(Collectors.toList());
      System.out.println(result);

      List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

      Optional<Integer> result1 = numbers1.stream().max(Integer::compare);
        System.out.println(result1);

        List<String> names = Arrays.asList("java", "spring", "hibernate");

        List<String> result2 = names.stream().map(String::toUpperCase).toList();
        System.out.println(result2);

        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
        List<String> result3 = words.stream().filter(n -> n.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(result3);

        List<Integer> numberss1 = Arrays.asList(1,2,2,3,4,4,5,6,6);
        numberss1.stream().distinct().forEach(System.out::print);

          List<Integer>  numbers2 = Arrays.asList(5,1,4,2,3);
        List<Integer> result4  = numbers2.stream().sorted().collect(Collectors.toList());
        System.out.println(result4);


        List<String> names1 = Arrays.asList("banana", "Apple", "cherry", "avocado");

        String result10 = names1.stream()
                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.joining(","));

        System.out.println(result10);

        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int secondLargest = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray()[arr.length - 2]; // careful with distinct count

        Integer i = Arrays.stream(arr).boxed().distinct().sorted().skip(1).findFirst().get();
        Integer i1 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println(i1);
        System.out.println(i);

    }
}
