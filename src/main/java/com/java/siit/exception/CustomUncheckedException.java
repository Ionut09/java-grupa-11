package com.java.siit.exception;

public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }

    public CustomUncheckedException() {
    }
}
