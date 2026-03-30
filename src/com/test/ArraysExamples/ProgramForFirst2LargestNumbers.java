package com.test.ArraysExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ProgramForFirst2LargestNumbers {
    public static void main(String[] args) {

        int inputNumberArray[] = {10, 5, 350, 100, 45, 95, 560};


       int first = Arrays.stream(inputNumberArray).boxed()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .findFirst()
                .get();


       int second =Arrays.stream(inputNumberArray)
                       .boxed()
                               .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(first);
        System.out.println(second);


        int firstLargestNumber = 0;
        int secondLargestNumber = 0;

        for(int i = 0; i<inputNumberArray.length;i++){
            if (firstLargestNumber < inputNumberArray[i]){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = inputNumberArray[i];
            } else if (secondLargestNumber < inputNumberArray[i]) {

                secondLargestNumber = inputNumberArray[i];

            }
        }

        System.out.println(firstLargestNumber +  " " + secondLargestNumber);

    }}




