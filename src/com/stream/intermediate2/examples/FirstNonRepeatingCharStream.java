package com.stream.intermediate2.examples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {
    public static void main(String[] args) {

        String str = "swiss";
        String s = Arrays.stream(str.split("")).collect(Collectors.groupingBy(
                w -> w,
                LinkedHashMap::new,
                Collectors.counting()
        ))
                .entrySet().stream()
                .filter(n -> n.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(s);


    }

}
