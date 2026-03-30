package com.simplecodingproblems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeAndSortedArray {
    public static void main(String[] args) {
        int[] array1 = {3,5,1,4};
        int[] array2 = {8,2,7,6};

        int[] array = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        System.out.println(array);

        int[] mergedArray = mergeAndSortArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
        // Output: [1,2,3,4,5,6,7,8]
    }
    public static int[] mergeAndSortArrays(int[] array1, int[] array2){
        int len1 = array1.length;
        int len2 = array2.length;
        // Create a new array to hold elements from both arrays
        int[] mergedArray = new int[len1 + len2];

        // Copy elements from the first array using for loop
        for(int i = 0; i<len1;i++){
            mergedArray[i] = array1[i];
        }

        // Copy elements from the Second array using for loop
        for(int i = 0; i<len2;i++){
            mergedArray[len1 + i] = array2[i];

        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }

}
