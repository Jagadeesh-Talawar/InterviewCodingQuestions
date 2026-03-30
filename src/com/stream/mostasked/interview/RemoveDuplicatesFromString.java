package com.stream.mostasked.interview;

import java.util.Arrays;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        String s = "dabcadefg";

        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
