package com.simplecodingproblems;

public class LargestNumberInAnArray
{
    public static void main(String[] args) {

        // Write a function to find the largest element in the array

        // Tip: to find the result, first we set the result initial values with either array first value
        // minimum value / 0 / blank. Then by the logic update them with the new result values.
        int[] numbers = {10,7,23,45,8};
        int largestNumbers = findLargestNumber(numbers);
        System.out.println(largestNumbers);
    }
    public static int findLargestNumber(int[] array){
        // Assume the first element as the largest number
        int largest = array[0];

        // Iterate the array to find the largest number
        for (int i = 0; i<array.length;i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;

    }
}
