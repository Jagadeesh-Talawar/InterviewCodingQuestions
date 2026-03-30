package com.stream.intermediate1.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);


        Map<Boolean, List<Integer>> result =  numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));

        System.out.println(result.get(true));
    }
}
