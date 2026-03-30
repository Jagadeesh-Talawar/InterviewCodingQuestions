package com.test.ArraysExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInAnArrayUsingLoopAndStream {

    public static void main(String[] args) {

        int[] inputNumArray = {10,5,10,34,24,90,24,70,100,102,100};

        for(int i =0;i<inputNumArray.length;i++){
            for(int j=i+1;j<inputNumArray.length;j++){
                if(inputNumArray[i] == inputNumArray[j]){
                    System.out.println("Found the duplicates : " + inputNumArray[i]);
                }
            }
        }

        List<Integer> result = Arrays.stream(inputNumArray)
                .boxed()
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(n -> n.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);

        Set<Integer> dupNumbersSet = new HashSet<>();
        for(Integer number : inputNumArray){
            if(!dupNumbersSet.add(number)){
                System.out.println(" Duplicate Element Found : " + number);
            }
        }




    }
}
