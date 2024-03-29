package com.tutorial.threadTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.atomic.LongAdder;

@Slf4j
@SpringBootTest
public class ThreadScopeTest {

    @Test
    void LongAdderTest(){

        // final Long counter = 0L; // bad for lambda
        LongAdder counter = new LongAdder();

        Runnable task = () -> counter.increment(); // i++ // or counter::increment() // lambda reference
        task.run(); // counter 1
        task.run();
        task.run();

        log.info("{}", counter.longValue());


        /**
         * How to solve ""error: ....final or effectively final""
         * result:
         * 2024-03-29T09:13:31.508+07:00  INFO 10752 --- [           main] c.tutorial.threadTest.ThreadScopeTest    : 3
         */

    }

}
