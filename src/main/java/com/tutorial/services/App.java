package com.tutorial.services;

import java.io.PrintStream;

public interface App {

    /**
     * Enum As Logger: Stream Selection (v2.1)
     * solution info error
     */

    public enum Log {

        INFO("\033[0;33m]", System.out),
        ERROR("\033[0;41m]", System.err);

        String template;
        String RESET = "\u001B[0m";
        PrintStream out;

        Log(String color, PrintStream out) {
            this.out = out;
            this.template = (color + "%s" + RESET);
        }

        public void out(String message) {
            String colored = this.template.formatted(message);
            System.out.println(colored);
        }

    }

    static void main(String... args) {

        Log.INFO.out("budhi");
        Log.ERROR.out("ex!");

    }

}
