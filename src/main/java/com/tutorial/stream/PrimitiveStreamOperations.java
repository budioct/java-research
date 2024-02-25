package com.tutorial.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamOperations {

    static void intStreamtoArray(Integer first, Integer second) {

        // From IntStream to int[]

        int[] array = IntStream.range(first, second).toArray(); // int[] toArray()
        for (int i : array) {
            System.out.println("loop from IntStream(): " + i);
        }
    }

    static void howToCalculateOnIntegerString(Integer first, Integer second) {

        // How To Calculate Stats on Integer List / Stream

        Stream<Integer> boxed = IntStream.range(first, second).boxed(); // Stream<Integer> boxed() // convert to Stream<T>
        IntSummaryStatistics collect = boxed.collect(Collectors.summarizingInt(n -> n));

        System.out.println("Count: " + collect.getCount());
        System.out.println("Sum: " + collect.getSum());
        System.out.println("Average: " + collect.getAverage());
        System.out.println("Max: " + collect.getMax());
        System.out.println("Min: " + collect.getMin());
    }

    public static void main(String[] args) {

//        PrimitiveStreamOperations.intStreamtoArray(0, 5);
        PrimitiveStreamOperations.howToCalculateOnIntegerString(0, 10);


    }

}
