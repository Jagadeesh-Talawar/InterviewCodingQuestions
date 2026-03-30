package com.test.ArraysExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {


        int[] numbers = {1,2,3};

        Integer reduce = Arrays.stream(numbers).boxed().reduce(1, (a, b) -> a + b);

        System.out.println(reduce);

        List<Integer> integers = Arrays.asList(10,12,50,30,18,19);

        integers.stream()
                .map(String::valueOf)
                .filter(n  -> n.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);



        int arr1[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int sum = (15*16)/2;

        int actualSum = 0;

        for(int i=0;i<arr1.length;i++){
            actualSum+= arr1[i];
        }
        System.out.println(" Missing Number is : " + (sum -actualSum));


        String str = "This is Jagadeesh This is Jagadeesh";

        int mid = str.length()/2;

        String lowerCase = "";
        String upperCase = "";

        for(int i=0;i<str.length();i++){
            if(i < mid){
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
            }
            else {
                upperCase = upperCase + Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println(lowerCase + " " + upperCase);


        List<Integer> numbers2 = List.of(1,0,-3,0,5,-2,0,8,0,-4);

        List<Integer> moveTozero = Stream.concat(numbers2.stream().filter(n ->n!=0), numbers2.stream().filter(n->n==0))
                .collect(Collectors.toList());

        System.out.println(moveTozero);


        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        int sum1 = 0;

        int missingLetter = (10*11/2);

        for(int i=0;i<arr.length;i++){
            sum1 = sum1+arr[i];
        }

        System.out.println(" Missing Number is : " + (missingLetter-sum1));


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        for (String s : list){
            list.remove(s);
        }


        String originalString = "Jagadeesh";
        String reversedString = "";

        for (int i = originalString.length()-1;i>=0;i--){
            reversedString = reversedString + originalString.charAt(i);
        }

        System.out.println(" Reversed String " + reversedString);

        List<Integer> duplicates = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        List<List<String>> data = List.of(List.of("a","b"), List.of("c"));


        List<Integer> numbers3 = Arrays.asList(1,2,3,14,5,6,7,8,19,10);

        String input = "java streams are awesome";





    }




}
