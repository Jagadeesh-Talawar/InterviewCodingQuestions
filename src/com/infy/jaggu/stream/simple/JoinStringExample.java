package com.infy.jaggu.stream.simple;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana","Mango", "Apricot");

        String collect =fruits.stream()
                .collect(Collectors.joining(","))
                .toString();

        System.out.println(collect);

    }
}
