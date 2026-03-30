package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;

public class AllPositiveExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

       boolean result= numbers.stream()
                       .allMatch(n -> n>0);

        System.out.println(result);
    }
}
