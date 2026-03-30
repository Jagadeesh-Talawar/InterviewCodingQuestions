package com.test.ArraysExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindMaxAndMinElementInAnArray {
    public static void main(String[] args) {

        int inputNumArray[] = {12, 39, 1008, 127, 89, 2987, 16, 28, 123, 787, 54, 10};

        int maxNumber = 12;
        int minNumber = 12;

        for(int i = 0; i<inputNumArray.length;i++){
            if (maxNumber < inputNumArray[i]){
                maxNumber = inputNumArray[i];
            } else if (minNumber > inputNumArray[i]) {
                minNumber = inputNumArray[i];

            }
        }

        System.out.println(" Large Number : " + maxNumber + " Min Number " + minNumber );



       int max  =  Arrays.stream(inputNumArray).max().getAsInt();
       int min  =  Arrays.stream(inputNumArray).min().getAsInt();

        System.out.println(" Maximun Number : " + max + " Minimun Number " + min);


    }
    }

