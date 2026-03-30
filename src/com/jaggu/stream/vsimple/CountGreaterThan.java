package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountGreaterThan {

    // count how many numbers are greater than 5 in a list

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        long result = numbers.stream()
                .filter(n -> n > 5)
                .count();


    }


}
