package com.kodilla.exception.test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        long count;

        List<String> result = strings.stream()
                .filter(s -> s.length() == 0)
                .collect(Collectors.toList());

        count = result.size();
        return count;
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        long count;

        List<String> result = strings.stream()
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());

        count = result.size();
        return count;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        List<String> result = strings.stream()
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());
        return result;
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {
        String result = strings.stream()
                .filter(a -> a.length() > 0)
                .collect(Collectors.joining(","));
        return result;
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {

        List<Integer> number = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> result = number.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        return result;
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        Integer max = Collections.max(numbers);
        return max;
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        Integer min = Collections.min(numbers);
        return min;
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += i;
        }
        return sum / numbers.size();
    }
}
