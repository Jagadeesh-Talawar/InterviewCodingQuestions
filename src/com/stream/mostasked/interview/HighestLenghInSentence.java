package com.stream.mostasked.interview;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLenghInSentence {

    public static void main(String[] args) {

        String s = "I am learning stream API in Java";

        String result = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();

        System.out.println(result);
    }
}
