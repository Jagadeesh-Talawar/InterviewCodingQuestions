package com.jaggu.stream.vsimple;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 4, 5, 5, 6, 7, 8, 9, 10));

        // numbers.stream().filter(n -> n%2 == 0).forEach(System.out::print);

        List<Integer> ans = numbers.stream().filter(n -> n == 2).collect(Collectors.toList());
        System.out.println(ans);

        List<Integer> ans1 = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(ans1);

        // Printing numbers which are only duplicates
        List<Integer> duplicates = Arrays.asList(3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 1,1,2,2);

        List<Integer> Ans =
                duplicates.stream()
                        .collect(Collectors.groupingBy(n -> n,Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

        System.out.println(" Printing only the duplicates : " + Ans);

        List<Integer> Ann3 = duplicates.stream()
                        .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                                .entrySet().stream()
                        .filter(e -> e.getValue() >1)
                                .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());


        System.out.println(Ann3);




    }

}
