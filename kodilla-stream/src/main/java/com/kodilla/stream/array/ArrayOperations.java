package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAvarage(int[] numbers){
        IntStream.range(0, numbers.length)
                .map(n -> n = numbers[n])
                .forEach(System.out::println);

        OptionalDouble avarage = IntStream.range(0, numbers.length)
                .map(n -> n = numbers[n])
                .average();
        return avarage.getAsDouble();
    }
}
