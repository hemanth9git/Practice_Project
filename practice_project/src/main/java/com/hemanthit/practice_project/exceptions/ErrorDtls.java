package com.hemanthit.practice_project.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorDtls {

    Date timestamp;
    int status;
    String error;
    String message;
    String path;

}
