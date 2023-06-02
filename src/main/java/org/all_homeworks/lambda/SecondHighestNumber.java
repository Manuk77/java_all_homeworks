package org.all_homeworks.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    private static Integer findSecondHighestNumber(List<Integer> numbers) {

        return numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 98, 74, 123));
        System.out.println(findSecondHighestNumber(list));
    }
}
