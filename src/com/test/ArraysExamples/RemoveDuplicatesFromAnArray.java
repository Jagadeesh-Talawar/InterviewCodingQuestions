package com.test.ArraysExamples;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAnArray {

    public static void main(String[] args) {


        int[] inputArrayWithDuplicates = {5,8,5,50,26,26,100,1001,5,120};

        Set<Integer> collect = Arrays.stream(inputArrayWithDuplicates).boxed().distinct().collect(Collectors.toSet());

        System.out.println(collect);



    }
    }
