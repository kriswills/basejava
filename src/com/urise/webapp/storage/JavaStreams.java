package com.urise.webapp.storage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 2, 5, 6, 7, 8, 9};
        System.out.println(minValue(values));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        oddOrEven(integers);
    }

    public static int minValue(int[] values) {
//
//        int result = Stream.of(values)
//                .distinct()
//                .reduce(0, (a,b) -> 9 * a + b);


        int theMin = IntStream.of(values).min().getAsInt();
        return theMin;
    }

    public static List<Integer> oddOrEven(List<Integer> integers) {
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is: " + sum);
        if (sum % 2 == 0) {
            List<Integer> notEvenList = integers.stream().filter(n -> (n % 2) != 0).collect(Collectors.toList());
            System.out.println(notEvenList);
            return notEvenList;
        } else {
            List<Integer> evenList = integers.stream().filter(n -> (n % 2) == 0).collect(Collectors.toList());
            System.out.println(evenList);
            return evenList;
        }
    }
}
