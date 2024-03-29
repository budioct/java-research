package com.tutorial.threadTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;
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

    @Test
    void testIllegalMonitorStateException() throws InterruptedException {

        Object object = new Object();
        // supaya thread safe, tetapi dead lock
//        synchronized (object){
//            object.wait();
//        }

        // tidak menggunakann sychronized akan kena exception
        object.wait();

        log.info("will not happen");

        /**
         * will be error
         * java.lang.IllegalMonitorStateException: current thread is not owner
         *
         * 	at java.base/java.lang.Object.wait0(Native Method)
         * 	at java.base/java.lang.Object.wait(Object.java:366)
         * 	at java.base/java.lang.Object.wait(Object.java:339)
         * 	at com.tutorial.threadTest.ThreadScopeTest.testIllegalMonitorStateException(ThreadScopeTest.java:39)
         * 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
         * 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
         * 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
         */
    }

    @Test
    void testFastestWayToCreateADeadlock() throws InterruptedException {

        Object object = new Object();
        synchronized (object){
            object.wait();
        }

        log.info("not happen");

        /**
         * ini akan deadloack
         */

    }

    @Test
    void testHowToSleepForDays() throws InterruptedException {

        Thread.sleep(1000); // tidur menunda selama 1 detik
        TimeUnit.DAYS.sleep(3); // tidur menunda selama 3 hari

    }

}
