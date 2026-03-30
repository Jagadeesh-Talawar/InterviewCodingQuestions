package com.codingpractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String[] args) {

        // We have one map with a String key and Integer value needs to sort Map by value not key.
        // Note - Using java 8 features only

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 3);
        map.put("C", 4);
        map.put("D", 2);

        Map<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.
                        toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println(collect);
    }
}
