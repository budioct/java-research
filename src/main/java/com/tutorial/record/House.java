package com.tutorial.record;

public class House {

    // Decorator Pattern with Java Records
    public record Decorate(Runnable r) implements Runnable {
        @Override
        public void run() {
            System.out.println("House.Decorate.run()");
            r.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Decorate d = new Decorate(() -> System.out.println("House.main()"));
        d.run(); // running job runnable

        /**
         * result:
         * House.Decorate.run()
         * House.main()
         */
    }

}
