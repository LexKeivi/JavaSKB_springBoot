package com.example.javaskb_springboot.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> message(CustomException customException){
        return new ResponseEntity<>(customException.getMessage(),HttpStatus.BAD_GATEWAY);
    }

}