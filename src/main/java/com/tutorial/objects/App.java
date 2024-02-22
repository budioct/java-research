package com.tutorial.objects;

public class App {

    /**
     * Sharing Code Between Constructors
     */

    public App(){
        System.out.println("parameterless");
    }

    public App(String name){
        System.out.println(name);
    }

    {
        // block static can sharing code between constructors
        System.out.println("shared code");
    }

    public static void main(String... args){
        new App();
        new App("with parameter");
    }
}
