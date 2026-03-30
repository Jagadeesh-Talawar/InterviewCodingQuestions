package com.stream.mostasked.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLeng {
    public static void main(String[] args) {

        String s = "I am learning stream API in Java";

       int ans = Arrays.stream(s.split(" ")).map(x -> x.length())
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        String string = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();

        System.out.println(string);

        System.out.println(ans);
    }
}
