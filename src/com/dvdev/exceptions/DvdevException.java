package com.dvdev.exceptions;

public class DvdevException extends RuntimeException {

    public DvdevException(String message) {
        super(message);
    }

    public DvdevException(Throwable cause) {
        super(cause);
    }

}
