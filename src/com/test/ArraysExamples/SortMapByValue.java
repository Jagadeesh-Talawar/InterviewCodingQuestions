package com.test.ArraysExamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 20);
        map.put("B", 50);
        map.put("E", 10);
        map.put("C", 11);
        map.put("D", 22);
        map.put("F", 30);


        LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue()
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
        ));

        System.out.println(collect);
    }
}
