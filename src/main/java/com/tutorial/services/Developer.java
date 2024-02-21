package com.tutorial.services;

public interface Developer {

    public record Opinion(int fun, int greatness){

    }

    static Opinion yourOpinionAboutJava(){
        return new Opinion(11, 11);
    }

}
