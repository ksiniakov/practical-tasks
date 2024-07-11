package com.walking.lesson20_exceptions.task3.exeption;

public class ArrayValidationException extends RuntimeException{
    public ArrayValidationException(String message) {
        super(message);
    }
}