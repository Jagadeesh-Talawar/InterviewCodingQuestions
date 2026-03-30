package com.stream.mostasked.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfEachWord {
    public static void main(String[] args) {

        String s = "I am learning Streams API in Java Java";

        Map<String, Long> result =Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
