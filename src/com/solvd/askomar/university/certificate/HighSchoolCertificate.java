package com.solvd.askomar.university.certificate;

import java.time.LocalDateTime;

public class HighSchoolCertificate extends Certificate {

  public HighSchoolCertificate(Integer id, Integer mark) {
    super(id, mark);
  }

  public HighSchoolCertificate(Integer id, Integer mark, LocalDateTime issuedAt) {
    super(id, fromTenToHundredMark(mark), issuedAt);
  }

  @Override
  public String toString() {
    return String.format("High School Certificate: %s mark", this.getMark());
  }

  private static Integer fromTenToHundredMark(Integer mark) {
    return mark * 10;
  }
}
