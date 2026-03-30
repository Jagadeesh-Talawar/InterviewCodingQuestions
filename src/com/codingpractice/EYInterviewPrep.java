package com.codingpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EYInterviewPrep {
    public static void main(String[] args) {
        // Write a code to merge two Arrays in one array using Java 8 features

        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6};

        List<Integer> list = IntStream
                .concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);

        String name = "Jagadeesh";

        String s = new StringBuilder(name).reverse().toString();
        System.out.println(s.equals(name));

        int[] arr = {1, 2, 3, 2, 4, 3};

        Set<Integer> seen = new HashSet<>();
        Arrays.stream(arr).filter(n -> !seen.add(n)).forEach(System.out::println);
    }
}
