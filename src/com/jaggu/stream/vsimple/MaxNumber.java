package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,6,7,9,3);


        Integer maxNumber = numbers.stream()
                .reduce(0, (a,b) -> Integer.max(a,b));

        System.out.println(maxNumber);
    }
}
