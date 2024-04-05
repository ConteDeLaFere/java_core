package com.javatutorial.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "четыре", "четыре", "четыре", "четыре"));
        fillRandom(numbers, 20);

        System.out.println(numbers);
        ListMethod.printOdds(numbers);

        System.out.println();
        ListMethod.printEvensDistinctOrdered(numbers);

        System.out.println();
        ListMethod.printUniqueWords(strings);

        System.out.println();
        ListMethod.printAmountOfDuplicates(strings);
    }

    public static void fillRandom(List<Integer> list, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(30));
        }
    }
}
