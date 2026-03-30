package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;

public class EvenSquaredSum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,6,7,9,3,2,4,9,1,2);

        Integer evenSquaredSum = numbers.stream()
                .filter( n -> n %2 == 0)
                .map(n -> n*n)
                .reduce(1, (a,b) -> a + b);

        System.out.println(evenSquaredSum);


    }
}
