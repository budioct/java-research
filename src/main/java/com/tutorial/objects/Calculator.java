package com.tutorial.objects;

// class
//public class Calculator {
//
//    private Calculator(){
//
//    }
//
//    public static int add(int a, int b){
//        return a + b;
//    }
//
//    public static int multiply(int a, int b){
//        return a * b;
//    }
//
//
//}

// inteface
public interface Calculator {

    /**
     * Interfaces are Better Utilities (Than Classes)..
     * prevent to instace big class came must to contructor,, we remove class change class to interface, hope code shorted because more readable
     */

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

}
