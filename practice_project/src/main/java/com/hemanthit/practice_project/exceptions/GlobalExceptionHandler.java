package com.hemanthit.practice_project.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice // Spring know this is the exception handling class in the applicaiton
public class GlobalExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)//Which exceptions arises
    public ResponseEntity<ErrorDtls> idNotFoundException(HttpServletRequest request){
        ErrorDtls error = new ErrorDtls(new Date(),410,"Id Not Found in the data base","Provided Id not in the datBase",request.getRequestURI());
        return new ResponseEntity<>(error, HttpStatus.OK);
    }
}
