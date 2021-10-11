package com.solvd.askomar.university;

public class PersonInvalidDataException extends Exception {

    public PersonInvalidDataException(String s) {
        super(s);
    }

    public PersonInvalidDataException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
