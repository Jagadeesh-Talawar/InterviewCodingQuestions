package com.simplecodingproblems;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Write a function to return the reverse of the string
        // Handle the edge cases after successfully running the program
        // Set the initial value blank and replace them with result
        String testString = "abba";
        boolean result = isPalindrome(testString);  // Set result
        System.out.println(result);
    }
    public static boolean isPalindrome(String input){
            if(input == null) { // edge case
                return  false;
            }
            StringBuilder reversed = new StringBuilder();
            for (int i= input.length()-1;i>=0;i--){
                reversed.append(input.charAt(i));
            }

            // Compare strings and return true or false
            if(input.equals(reversed.toString())){
                return true;
            }
            else {
                return  false;
            }
        }
    }

