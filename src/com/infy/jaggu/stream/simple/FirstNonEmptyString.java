package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {

        List<String> stirngs = Arrays.asList("", "", "Hello", "World", "");

        Optional<String> first =stirngs.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();

        Optional<String> second = stirngs.stream()
                        .filter(s -> !s.isEmpty())
                                .findFirst();

        System.out.println(second.get());

    }
}
