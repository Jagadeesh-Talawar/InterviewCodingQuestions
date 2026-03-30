package com.java.StringProblems;

import java.util.*;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        // Input:: programming
        // Output:: progaming

        String str = "programming";
       Arrays.stream(str.split("")).distinct().forEach(System.out::print);

       // Using indexOf() method

        // Using Character Array

        // Using Set interface method

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i<str.length();i++){
           char ch = str.charAt(i);
           int idx = str.indexOf(ch, i+1);
           if (idx == -1){
               sb2.append(ch);
           }

        }
        System.out.println(sb2);

        // Approach 3

        char[] arr = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for (int i =0; i<arr.length;i++){
            boolean repeated = false;
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] == arr[j]);
                repeated = true;
                break;
            }
            if(!repeated){
                sb3.append(arr[i]);
            }
        }
        System.out.print(sb3);

        // Approach 4
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character c : set){
            sb4.append(c);
        }
        System.out.println(sb4);

    }

}
