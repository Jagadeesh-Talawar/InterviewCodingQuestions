package com.test.ArraysExamples;


public class StringReverse {
    public static void main(String[] args) {

        String str = "adfagasdh";
        System.out.println(reverse(str));

    }

    public static String reverse(String str){
        String a = String.valueOf(str.charAt(0));
        String b = String.valueOf(str.charAt(str.length()-1));

        String c = "";
        for (int i = str.length()-2;i>=1;i--){
            c = c + String.valueOf(str.charAt(i));
        }
        return  a+c+b;
    }
}
