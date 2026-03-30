package com.simplecodingproblems;

public class SumAllElementsInAnArray {
    public static void main(String[] args) {
        // Write a function to calculate the sum of all elements in an array ?
        // Tip: Break down the big problem into smaller problem and then solve them.

        int[] numbers = {1,2,3,4,5};  // input
        int sum = calculateSum(numbers);
        System.out.println(sum); // Output: 15
    }
    public static int calculateSum(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
