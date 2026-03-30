package com.java.StringProblems;

import java.util.Arrays;

public class ReplaceCharacterWithItsOccurance {
    public static void main(String[] args) {
        // Java program to replace a character with it's occurrence in given String
        // Input: OPENTEXT
        // NOTE: Replace character 'T' with it's occurrence
        // Output: OPEN1EX2

        String input = "opentext";
        char charToReplace = 't';
        // expected output: open1ex2

        // check char presence in string
        if(input.indexOf(charToReplace)== -1){
            System.out.println(" Given Character Not Available in the given input string ");
            System.exit(0);
        }
        // Logic  to replace char occurrence in string
        char[] arr =  input.toCharArray();
        int cnt = 1;
        for (int i  = 0; i<arr.length;i++){
            if(arr[i]== charToReplace){ // o == t p==t e==t n==t t==t
                arr[i] =  String.valueOf(cnt).charAt(0);
                cnt ++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
