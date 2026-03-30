package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,9,11,2,8,21,1);

        Optional<Integer> first = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(first.get());


                 }
}
