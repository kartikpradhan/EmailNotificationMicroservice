package com.kp.kafka.email.exception;
public class RetryableException extends RuntimeException {

    public RetryableException(Exception exception) {
        super(exception);
    }
    public RetryableException(String message) {
        super(message);
    }
}