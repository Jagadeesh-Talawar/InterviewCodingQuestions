package com.simplecodingproblems;

public class FactorialFinding {
    public static void main(String[] args) {
        // Edge cases are handled before the normal logic of the program, because for edge cases normal logic is
        // not applicable
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println(factorial); // Output: 120
    }

    public static long calculateFactorial(int num){
        if(num == 0){
            return 1;
        }
        long result = 1;// Set initial value
        for(int i = 1;i<=num;i++){
            result = result *i;

        }
        return  result;
    }
}
