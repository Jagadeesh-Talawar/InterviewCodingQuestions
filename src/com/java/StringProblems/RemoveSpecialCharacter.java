package com.java.StringProblems;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        // "$ja!va$&star"

        String str = "$ja!va$&star";

        // Approach 1 Using replace all method
        String plainString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainString);
    }
}
