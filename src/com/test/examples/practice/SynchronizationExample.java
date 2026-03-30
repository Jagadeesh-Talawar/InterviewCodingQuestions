package com.test.examples.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Counter{

    int count = 0;

    synchronized void increment(){
        count++;
    }
}
public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        StringBuffer st = new StringBuffer();

        Thread t3 = new Thread(() -> {
            for(int i = 0; i<=1000;i++){
                st.append("Hello");
                System.out.println(st);
            }
        });

        Thread t4 = new Thread(() -> {
            for(int i = 0; i<=1000;i++){
                st.append("Hero");
                System.out.println(st);
            }
        });

        Thread t1 = new Thread(() ->
                c.increment());

        Thread t2 = new Thread(() ->
                c.increment());


//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(c.count);
//
//        t3.start();
//        t4.start();
//
//        t3.join();
//        t4.join();


        List<String> list = List.of("Java", "Hello");

        List<Character> list1 = list.stream().flatMap(word -> word.chars().mapToObj(s -> (char) s)).toList();

        String[] input10 = {"Java", " ", null, "Streams", "", "Hello"};

        String[] array = Arrays.stream(input10).filter(Objects::nonNull).filter(s -> !s.isBlank()).toArray(String[]::new);

        List<String> words = List.of("Java", "Stream", "API");

        int total = words.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(total);

        long collect = words.stream().mapToInt(String::length).count();


        System.out.println(collect);

        List<Character> characterStream= words.stream().flatMap(word -> word.chars().mapToObj(d -> (char) d)).toList();

        System.out.println(characterStream);

    }


}
