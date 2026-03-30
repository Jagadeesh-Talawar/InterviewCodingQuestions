package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,10,15,20,25);

        // If we want to perform the mathematical operations using stream them
        // we need to convert from Integer to int using mapToInt(Integer::intValue)
         double average =numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                 .orElse(0.0);
         double average1 = numbers.stream()
                         .mapToInt(Integer::intValue)
                                 .average()
                                         .orElse(0.0);

        System.out.println(average1);
        System.out.println(average);


    }
}
