package com.infy.jaggu.stream.simple;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleby
{
    public static void main(String[] args)
    {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);


        boolean match = numbers.stream()
                        .anyMatch(n ->  n % 3 == 0);

        System.out.println(match);

    }
}
