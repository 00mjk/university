package com.solvd.university;

public class CertificateInvalidDataException extends RuntimeException {

    public CertificateInvalidDataException(String s) {
        super(s);
    }

    public CertificateInvalidDataException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
