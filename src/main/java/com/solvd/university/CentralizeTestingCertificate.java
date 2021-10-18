package com.solvd.university;

import java.time.LocalDateTime;
import java.util.Objects;

public class CentralizeTestingCertificate extends Certificate {

    private Subject subject;

    public CentralizeTestingCertificate(Integer id, Subject subject, Integer mark) {
        super(id, mark);
        this.subject = subject;
    }

    public CentralizeTestingCertificate(Integer id, Subject subject, Integer mark, LocalDateTime issuedAt) {
        super(id, mark, issuedAt);
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\ttype - Centralize Testing\n\tsuject - %s", super.toString(), this.subject);
    }

    @Override
    public String getCertificateType() {
        return "Centralize Testing Certificate";
    }
}
