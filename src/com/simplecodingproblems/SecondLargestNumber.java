package com.simplecodingproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // Write a function to find the second largest number in an array VIMP
        // Tip: Solve the simple case first
        // Tip: Solve the edge case or complex cases later
        int[] numbers = {10,7,23,45,8};
        int secondLargest = secondLargestNumber(numbers);
        System.out.println(secondLargest);

        int[] numbers1 = {10,7,23,45,8};
        Integer i = Arrays.stream(numbers1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);

    }
    public static int secondLargestNumber(int[] array){
        int largest = Integer.MIN_VALUE;  // OR 0  using Integer using if there are any negative values
        int secondLargest = Integer.MIN_VALUE; // 0

        for(int i = 0; i<array.length;i++){
            int num = array[i];
            if(largest < num){
                secondLargest = largest;
                largest =  num;
            }// Special case {10,7,23,45,30};
            else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }
        return  secondLargest;

    }


}
