package com.simplecodingproblems;

public class BinarySearch {
    public static void main(String[] args) {

        // Tip1: Repeatedly divide the sorted array in half
        // Tip2: Compare the target to the middle element
        // Tip3: Narrow the search until the target element is found

        int[]  numbers = {2,30,4,10,40};
        int target = 10;

        int result = binarySearch(numbers,target);
        if(result == -1){
            System.out.println("Elements not present in the Array");
        }
        else {
            System.out.println(" Elements found at index " + result);
        } // Element found at index 3
    }
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length -1; //4
        while (left <= right) { // 0 <= 4, 3 <= 4
            int mid = left + (right - left) / 2; // 2,3

            // check if target is present at middle
            if(array[mid] == target){ // 4 == 10, 10 == 10
                return  mid; // Target found at index mid

            }
            // If the target is greater, ignore the left half
            if(array[mid] < target){ // 4 < 10
                left = mid + 1; //3
            }
            // If target is smaller, ignore the right half
            else {
                right = mid -1;
            }
        }
        // Target not found in array
        return  -1;
    }
}
