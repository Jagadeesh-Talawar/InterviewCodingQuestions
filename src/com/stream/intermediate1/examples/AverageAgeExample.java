package com.stream.intermediate1.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeExample {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Jaggu", 25),
                new Person("Abhi", 30),
                new Person("Sammi", 35),
                new Person("Revati", 40),
                new Person("Sangu", 45),
                new Person("Pinki", 50)
        );

       double s = people.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println(s);

    }
}
