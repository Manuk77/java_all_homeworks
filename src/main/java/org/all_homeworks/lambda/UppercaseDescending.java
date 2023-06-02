package org.all_homeworks.lambda;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseDescending {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        // Convert the strings to uppercase and sort them in descending order

        List<String> uppercaseAndSorted = convertToUppercaseAndSort(strings);
        // Print the uppercase and sorted strings

        System.out.println(uppercaseAndSorted);

    }
    public static List<String> convertToUppercaseAndSort(@NotNull List<String> strings) {
        // Convert the strings to uppercase and sort them in descending order using a lambda expression
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}

