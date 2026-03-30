package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        // 1,4 ,9 ,16,25,64

        // here we will use map

       List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
