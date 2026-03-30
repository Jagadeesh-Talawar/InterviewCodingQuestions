package com.codingpractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AccentureInterview {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,2,4,9);

        // Ouput: [2,4]

        // Write the program to find the duplicates
       List<Integer> result = number.stream().collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
