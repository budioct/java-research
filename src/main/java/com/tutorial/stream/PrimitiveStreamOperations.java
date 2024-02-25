package com.tutorial.stream;

import java.util.stream.IntStream;

public class PrimitiveStreamOperations {

    static void intStreamtoArray(Integer first, Integer second) {

        // From IntStream to int[]

        int[] array = IntStream.range(first, second).toArray(); // int[] toArray()
        for (int i : array) {
            System.out.println("loop from IntStream(): " + i);
        }
    }

    public static void main(String[] args) {

        PrimitiveStreamOperations.intStreamtoArray(0, 5);
    }

}
