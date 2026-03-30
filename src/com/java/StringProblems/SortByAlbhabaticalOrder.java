package com.java.StringProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByAlbhabaticalOrder {
    public static void main(String[] args) {
        String str = "rock";

        // using sort method

        Arrays.stream(str.split("")).sorted().forEach(System.out::print);
        // without using sort method
        System.out.println("");
        char temp;
        char[] arr = str.toCharArray();
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));


        String str1 = "rock";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(arr));
    }
}
