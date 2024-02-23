package com.tutorial.servicetest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.System.Logger.Level;

@SpringBootTest
public class LoggerWithoutanImportTest {

    @Test
    void testLoggerWithanImport(){

        /**
         * The Logger Without an Import
         */

        System.Logger logger = System.getLogger("this LOG Broo!"); // Logger getLogger(String name)
        logger.log(Level.INFO, "Hello, World"); // default void log(Level level, String msg)

        /**
         * result:
         * 2024-02-23T13:35:50.937+07:00  INFO 5804 --- [           main] this LOG Broo!                           : Hello, World
         */

    }

}
