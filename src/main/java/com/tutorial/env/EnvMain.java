package com.tutorial.env;

public class EnvMain {

    public static void main(String[] args) {

        // When to Use Java Interfaces

        Configuration configuration = Configuration.create(); // implement ENV
        String value = configuration.getValue("JAVA_HOME", "assseeeekkk");
        System.out.println(value);

        /**
         * result
         * return new SystemPropertyConfiguration().. get param defaultValue ====> C:\Program Files\Java\jdk-21
         * new EnvConfiguration().. get param key ====> C:\Program Files\Java\jdk-21
         */

    }

}
