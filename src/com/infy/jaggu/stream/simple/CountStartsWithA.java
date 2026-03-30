package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountStartsWithA {

    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        int result = (int) fruits.stream()
                .filter(fr -> fr.startsWith("A"))
                .count();

        System.out.println(result);

    }


}
