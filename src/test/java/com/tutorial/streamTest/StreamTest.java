package com.tutorial.streamTest;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class StreamTest {

    @Test
    void FromStreamtoIntArray(){

        int[] array = IntStream.range(0, 5).toArray();
        for (int i : array) {
            System.out.println(i);
        }
        /**
         * From IntStream to int[]
         * 0
         * 1
         * 2
         * 3
         * 4
         */
    }

}
