package com.test.ArraysExamples;

public class CodingPractice {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 12;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(arr[i] + " , " + arr[j]);
//                    return;
//                }
//
//            }
//        }

        for (int i = 0; i< arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == target){
                    System.out.println(arr[i] +  " " + arr[j]);
                    return;
                }
            }
        }
    }
}
