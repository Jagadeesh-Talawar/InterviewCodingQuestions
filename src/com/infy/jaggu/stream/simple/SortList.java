package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        // Program to sort the elements in the ascending and descending order

        List<Integer> numbers = Arrays.asList(5,1,8,3,2,10);

        List<Integer> result =numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result);

    }
}
