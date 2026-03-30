package com.simplecodingproblems;

import java.util.Arrays;

public class AnagramCheckProblem {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = areAnagrams(s1,s2);
        System.out.println(result);
    }
    public static boolean areAnagrams(String str1, String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare the arrays
        return Arrays.equals(charArray1,charArray2);
    }
}
