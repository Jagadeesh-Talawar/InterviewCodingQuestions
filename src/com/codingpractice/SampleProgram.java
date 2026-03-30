package com.codingpractice;

import com.stream.hard.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SampleProgram {
    public static void main(String[] args) {

        List<Emp> employees = Arrays.asList(
                new Emp("Jaggi", 4000, 1, "M", "IT"),
                new Emp("Bod", 8000, 2, "F", "HR"),
                new Emp("Jaggi", 6000, 3, "M", "FINANCE"),
                new Emp("JSON", 7000, 4, "F", "SALES"),
                new Emp("Abhi", 8000, 5, "M", "HR"),
                new Emp("JOMES", 8000, 6, "F", "SALES")
        );

        String str = "Hello World";
        List<Character> list = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(n -> "aeiou".indexOf(n) != -1)
                .toList();
        System.out.println(list
        );


        System.out.println(list);

    }
}
