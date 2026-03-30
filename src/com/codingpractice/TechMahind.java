package com.codingpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TechMahind {
    // Don't use If else condition
    public static int testData(int n){
        // Write logic to return if input 7 return 11 input 11 return 7
        return  7+11-n;
    }
    public static void main(String[] args) {

        System.out.println(" Input is 7: " + testData(7));

        int a = 7;
        int b = 8;

        a = a + b;
        a = a - b;
        b = a - b;

        System.out.println(" Inpput is 11: " + testData(11));

        System.out.println(" Printing the a " + a + " And printing the value b " + b);



    }
}
