package com.java.StringProblems;

public class StringReverse {
    public static void main(String[] args) {

        String s = "Jagadeesh Talawar";
        int length = s.length();
        System.out.println(length);
        // Approach 1
        char[] chArr =  s.toCharArray();
        for(int i = chArr.length-1;i>=0;i--)
        {
            System.out.print(chArr[i]);
        }
        System.out.println("");
        // Approach 2
        for (int i = s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        // Approach 3
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse());
        System.out.println("");
        // Approach 4
        StringBuffer stringBuilder = new StringBuffer(s);
        System.out.println(stringBuilder.reverse());





    }
}
