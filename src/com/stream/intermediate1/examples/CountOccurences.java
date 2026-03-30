package com.stream.intermediate1.examples;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurences {
    public static void main(String[] args) {

        List<String> items  = Arrays.asList("", "banana", "apple", "orange", "banana", "orange");

         Map<String, Long> result = items.stream()
                         .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(result);



        List<String> words = Arrays.asList("apple", "bat", "cat", "dog", "banana", "kiwi");

        Map<String, Long> ans = words.stream().collect(Collectors.groupingBy(
                w ->  w,
                Collectors.counting()
        ));

        System.out.println(ans);

        Map<Integer, Long> ans2 = words.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
        ));

        System.out.println( " ans2 " + ans2);

        String sentence = "banana apple orange apple kiwi banana";

        // [apple, banana, kiwi, orange]

        List<String> distinct = Arrays.stream(sentence.split(" "))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(" distinct " +distinct);;

        String input = "aabbcdde";

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);







    }
}
