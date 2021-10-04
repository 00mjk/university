package com.solvd.askomar.university.certificate;

import com.solvd.askomar.university.Subject;

import java.time.LocalDateTime;
import java.util.Objects;

public class CentralizeTestingCertificate extends Certificate {

  private Subject subject;

  public CentralizeTestingCertificate(Integer id, Subject subject, Integer mark) {
    super(id, mark);
    this.subject = subject;
  }

  public CentralizeTestingCertificate(
      Integer id, Subject subject, Integer mark, LocalDateTime issuedAt) {
    super(id, mark, issuedAt);
    this.subject = subject;
  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CentralizeTestingCertificate that = (CentralizeTestingCertificate) o;
    return Objects.equals(subject, that.subject);
  }

  // TODO refactor hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }

  @Override
  public String toString() {
    return String.format(
        "Centralize Testing Certificate:\n\tSubject: %s - %s mark",
        this.subject.toString(), this.getMark());
  }
}
