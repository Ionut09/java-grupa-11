package com.java.siit.exception;

public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(Throwable cause) {
        super(cause);
    }

    public CustomCheckedException() {
    }
}
