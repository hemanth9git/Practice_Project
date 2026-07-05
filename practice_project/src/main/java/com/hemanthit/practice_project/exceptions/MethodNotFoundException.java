package com.hemanthit.practice_project.exceptions;

public class MethodNotFoundException extends RuntimeException{

    public MethodNotFoundException(){
        super();
    }

    public MethodNotFoundException(String msg){
        super(msg);
    }
}
