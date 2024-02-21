package com.tutorial.servicetest;

import com.tutorial.services.Developer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class DeveloperTest {

    @Test
    void testDeveloper(){

        Developer.Opinion op = Developer.yourOpinionAboutJava();
        log.info("{}", op);
    }

}
