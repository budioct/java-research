package com.tutorial.servicetest;

import com.tutorial.services.App;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AppTest {

    @Test
    void testEnumAsMinimalistic(){

        App.Log.INFO.out("budhi"); // color yellow
        App.Log.ERROR.out("ex!"); // color red
    }

}
