package com.simplecodingproblems;

public class FibonacciSequece {
    public static void main(String[] args) {
        int n = 7; // input
        generateFibonacci(n);
    }
    public static void generateFibonacci(int n){
        int a = 0, b = 1;
        System.out.println(+ a + ", " + b);
        for (int i = 2; i<n;i++){
            int next = a + b;
            System.out.println(", " + next);
            a = b;
            b = next;
        }
    } // Output: 0,1,1,2,3,5,8

}
