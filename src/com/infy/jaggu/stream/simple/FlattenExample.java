package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;

public class FlattenExample {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8)
        );

        List<Integer> result = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(result);

    }
}
