package com.example.javaskb_springboot.errors;

public class CustomException extends Exception {
    public CustomException() {
        super("Тебе сюда нельзя!");
    }
}
