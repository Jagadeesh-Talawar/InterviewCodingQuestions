package com.stream.intermediate2.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequestChar {

    public static void main(String[] args) {


        String input = "banana";

       List<String> result  =  Arrays.stream(input.split("")).collect(Collectors.groupingBy(w -> w, Collectors.counting()))
               .entrySet().stream()
               .filter(e -> e.getValue()>2)
                       .map(Map.Entry::getKey)
                               .collect(Collectors.toList());

        System.out.println(result);


        // ['b', 'a', 'n', 'a', 'n', 'a']


        Arrays.stream(input.split("")).flatMap(word -> word.chars().mapToObj(c -> (char)c)).forEach(System.out::print);


        input.chars()
                .mapToObj(c -> (char) c)
                .forEach(System.out::print);
    }
}

