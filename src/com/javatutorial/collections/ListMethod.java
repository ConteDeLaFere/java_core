package com.javatutorial.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMethod {
    public static void printOdds(List<Integer> list) {
        list.stream()
                .filter(i -> i % 2 == 1)
                .forEach(i -> System.out.print(i + " "));
    }

    public static void printEvensDistinctOrdered(List<Integer> list) {
        list.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .sorted()
                .forEach(i -> System.out.print(i + " "));
    }

    public static void printUniqueWords(List<String> words) {
        words.stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));
    }

    public static void printAmountOfDuplicates(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);
    }
}
