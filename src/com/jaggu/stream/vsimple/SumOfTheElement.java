package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;

public class SumOfTheElement {

    public static void main(String[] args) {

        // Here I want reduce the elements for that I can perform the
        // reduce from the streams and find the sum
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

       Integer sum= numbers.stream()
                .reduce(0, (a,b) -> a + b);

        System.out.println(sum);

    }
}
