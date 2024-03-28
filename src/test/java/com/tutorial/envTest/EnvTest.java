package com.tutorial.envTest;

import org.junit.jupiter.api.Test;

public class EnvTest {

    @Test
    void testGetJavaHome(){

        String javaHome = System.getenv().get("JAVA_HOME");
        System.out.println(javaHome);

        /**
         * print java home local dev
         * C:\Program Files\Java\jdk1.8.0_241
         */
    }

}
