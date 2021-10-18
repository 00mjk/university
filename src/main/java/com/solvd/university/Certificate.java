package com.solvd.university;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Certificate {

    private static final long MIN_ID = 100000000;
    private static final long MAX_ID = 999999999;
    private static final int MIN_MARK = 0;
    private static final int MAX_MARK = 100;

    private Integer id;
    private Integer mark;
    private LocalDateTime issuedAt;

    public Certificate(Integer id, Integer mark) {
        if (id < MIN_ID || id > MAX_ID || mark < MIN_MARK || mark > MAX_MARK) {
            throw new CertificateInvalidDataException("Certificate data should be valid");
        }
        this.id = id;
        this.mark = mark;
        this.issuedAt = LocalDateTime.now();
    }

    public Certificate(Integer id, Integer mark, LocalDateTime issuedAt) {
        this(id, mark);
        if (Objects.isNull(issuedAt)) {
            throw new CertificateInvalidDataException("Certificate data should exists");
        }
        if (issuedAt.compareTo(LocalDateTime.now()) > 0) {
            throw new CertificateInvalidDataException("Certificate date and time shouldn't be more than current");
        }
        this.issuedAt = issuedAt;
    }

    public abstract String getCertificateType();

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        if (id < MIN_ID || id > MAX_ID) {
            throw new CertificateInvalidDataException("Id in 'Certificate' should not be less than " + MIN_ID + " and more than " + MAX_ID);
        }
        this.id = id;
    }

    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        if (mark < MIN_MARK || mark > MAX_MARK) {
            throw new CertificateInvalidDataException("Mark in 'Certificate' should no be less than " + MIN_MARK + " and more than " + MAX_MARK);
        }
        this.mark = mark;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        if (Objects.isNull(issuedAt)) {
            throw new CertificateInvalidDataException("Certificate date and time should exists");
        }
        if (issuedAt.compareTo(LocalDateTime.now()) > 0) {
            throw new CertificateInvalidDataException("Certificate date and time shouldn't be more than current");
        }
        this.issuedAt = issuedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Certificate that = (Certificate) o;
        return Objects.equals(id, that.id)
                && Objects.equals(mark, that.mark)
                && Objects.equals(issuedAt, that.issuedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, issuedAt);
    }

    @Override
    public String toString() {
        return String.format("Certificate:\n\tidentificator - %d\n\tmark - %d\n\tIssued at - %s", this.id, this.mark, this.issuedAt);
    }
}
