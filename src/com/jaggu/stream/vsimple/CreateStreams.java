package com.jaggu.stream.vsimple;

import java.util.Arrays;
import java.util.List;

public class CreateStreams {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jagadeesh", "Abhishek", "Abhi");

        List<Integer> converting = (List<Integer>) names.stream();



    }
}
