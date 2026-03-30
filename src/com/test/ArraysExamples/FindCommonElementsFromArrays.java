package com.test.ArraysExamples;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromArrays {
    public static void main(String[] args) {

        int[] inputArray1 = {1,2,34,33,45,56,12,3,6,7};
        int[] inputArray2 = {1,2343,34535,45,65,3,8,10};

        for(int i=0;i<inputArray1.length;i++){
            for(int j=0;j<inputArray2.length;j++){

                if(inputArray1[i] == inputArray2[j]){{
                    System.out.println(inputArray1[i]);
                    break;
                }
                }

            }
        }

        Set<Integer> set2 = Arrays.stream(inputArray1).boxed().collect(Collectors.toSet());

        Set<Integer> collect = Arrays.stream(inputArray2).boxed().filter(set2::contains).collect(Collectors.toSet());


        System.out.println(collect);
    }


}
