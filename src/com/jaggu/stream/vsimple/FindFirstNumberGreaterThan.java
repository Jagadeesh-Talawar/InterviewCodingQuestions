package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7,11, 12, 5, 20);

         Optional<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                 .sorted()
                .findFirst();
        System.out.println(result.get());


    }
}
