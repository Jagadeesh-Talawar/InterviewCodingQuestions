package com.java.StringProblems;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = " J a va s ta r ";

        String trimmedString = str.trim();
        // Here the trim method is used to remove leading and trailing spaces of the String here
        // our requirement is to remove the white from the center also for that we have
        System.out.println(trimmedString);

        // we will use regular expression
        String trimmedString1 = str.replaceAll("\\s", "");
        System.out.println(trimmedString1);
    }
}
