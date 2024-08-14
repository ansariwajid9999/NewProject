package com.example.newAssignment.customExceptions;

public class InvalidSearchException extends RuntimeException{
    public InvalidSearchException(String message) {
        super(message);
    }
}