package com.test.ArraysExamples;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;


public  class Practicee {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50,51);

        String test  = "Jagadeesh";
        Character result = test.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(result);
        List<String> list1 = Arrays.asList("Greeks", "for", "gfg", "Greekforgeeks", "GeeksQuiz");

        list1.stream().mapToInt(str -> str.length()).forEach(System.out::println);

        List<String> list2 = Arrays.asList("3", "6", "8",
                "14", "15");



        list2.stream().mapToInt(num -> Integer.parseInt(num)).
                filter(n -> n%3 == 0).forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(3, 6, 8,
                14, 15,12,19);

        List<String> list4 = list3.stream().map(n -> String.valueOf(n))
                .filter(s -> s.startsWith("1"))
                .toList();

        System.out.println(list4);

        List<String> list5 = list3.stream().map(n -> n.toString(n))
                .filter(a -> a.startsWith("1"))
                .toList();

        System.out.println(list5);



    }
}
