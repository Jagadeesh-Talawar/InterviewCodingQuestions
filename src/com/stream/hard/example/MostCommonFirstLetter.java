package com.stream.hard.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {

        List<Employee>  employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Alice", "IT", 55000),
                new Employee(3, "Bob", "IT", 609099),
                new Employee(4, "Carol", "IT", 70000),
                new Employee(5, "David", "IT", 80000),
                new Employee(6, "Eve", "IT", 90000),
                new Employee(7, "Ala", "IT", 100000),
                new Employee(7, "Jaga", "IT", 20000000),
                new Employee(7, "Abhi", "IT", 2000000)
        );

        Map<Character, Long> employee  = employees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<Character, Long>> max = employee.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(employee);

        System.out.println(max);

        Optional<Map.Entry<Character, Long>> result = employees.stream().map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(result);
        
        
        int[] array = {1,1,2,3,3,4,4,5,6,6,6,7,8,9};

        Map<Integer,Integer> resutMap = new TreeMap<>();

        for( int num : array){
            resutMap.put(num, resutMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Final Result: " + resutMap);


        List<String> input = List.of("swiss");

        Character c1 = input.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .get();

        System.out.println(c1);

        int number = 5;
        long factorial = 1;

        // Factorial Logic
        for (int i =1; i <= number; i++){
            factorial  = factorial * i;

        }

        System.out.println(factorial);

        int a =4;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" A would be: " + a + " B would be: " + b);


        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        Integer i = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(i);


    }
}
