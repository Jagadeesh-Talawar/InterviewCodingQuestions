package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDistinctElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,5,2,8,2,3,5,9,13,2,1,9,9,9);

        List<Integer> ans1 =numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(ans1);


        List<Integer> result =numbers.stream()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
