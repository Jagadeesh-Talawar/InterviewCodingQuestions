package com.simplecodingproblems;

import java.util.Arrays;

public class SortAnArrayUsingBubbleSort {
    public static void main(String[] args) {
        // Write a function to sort an Array of numbers in ascending order(bubble sort) V.IMP

        int[] numbers = {5,2,9,1}; // Input
        Arrays.sort(numbers); // Sort the array in ascending order

        // Output [1,2,5,9]

    }
    // In bubble sort, compare and swap adjecent elements if they are not ordered.
    // Repeat these steps to move the largest to the end until arrays is sorted
    public static void bubbleSortArray(int[] array){
        int n = array.length;
        boolean swapped;
        for(int i = 0; i< n -1;i++){ // Outer loop
            swapped = false;
            for(int j = 0;j<n-1-i;j++){ // Inner loop
                if(array[j] > array[j + 1]){
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if(!swapped) break;
        }


    }
}
