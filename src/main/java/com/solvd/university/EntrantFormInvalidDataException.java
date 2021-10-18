package com.solvd.university;

public class EntrantFormInvalidDataException extends RuntimeException {

    public EntrantFormInvalidDataException(String s) {
        super(s);
    }

    public EntrantFormInvalidDataException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
