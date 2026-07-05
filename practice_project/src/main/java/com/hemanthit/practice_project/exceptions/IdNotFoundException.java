package com.hemanthit.practice_project.exceptions;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException(){
        super();
    }

    public IdNotFoundException(String msg){
        super(msg);
    }

}
