package com.tutorial.services;

public interface ShorterConstants {

     public static final String WORLD = "Hello, World";

    // Shortest Possible Constant Declaration
    String MESSAGE = "Hello, Constants"; // ShorterConstants keep able to execute

}

class ShorterConstantsImpl {
    public static void main(String[] args) {

        System.out.println(ShorterConstants.WORLD);
        System.out.println(ShorterConstants.MESSAGE);

        /**
         * result:
         * Hello, World
         * Hello, Constants
         */
    }

}
