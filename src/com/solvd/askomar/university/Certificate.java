package com.solvd.askomar.university;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Certificate {

    private Integer id;
    private Integer mark;
    private LocalDateTime issuedAt;

    public Certificate(Integer id, Integer mark) {
        this.id = id;
        this.mark = mark;
        this.issuedAt = LocalDateTime.now();
    }

    public Certificate(Integer id, Integer mark, LocalDateTime issuedAt) {
        this(id, mark);
        this.issuedAt = issuedAt;
    }

    public abstract String getCertificateType();

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
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
        return String.format("Certificate:\n\tidentificator - %d\n\tmark - %d\n\tIssued at - %s");
    }
}
