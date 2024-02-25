package com.tutorial.servicetest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class StringTest {

    @Test
    void testStringFormatted() {

        // "formatted": a shorter String.format

        //String message = String.format("hello %s is %d", "budhi", 27); // static String format(String format, Object... args)
        String message = "hello, %s is %d".formatted("budhi", 27); // String formatted(Object... args)
        log.info("message: {}", message);

        /**
         * result:
         * 2024-02-25T11:37:33.077+07:00  INFO 14740 --- [           main] com.tutorial.servicetest.StringTest      : message: hello budhi is 27
         * 2024-02-25T11:38:22.634+07:00  INFO 7424 --- [           main] com.tutorial.servicetest.StringTest      : message: hello, budhi is 27
         *
         * if varargs is null param --> java.util.MissingFormatArgumentException: Format specifier '%d'
         */
    }

}
