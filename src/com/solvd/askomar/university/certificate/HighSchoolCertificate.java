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
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return String.format("%s\n\ttype - High school certificate", super.toString());
  }

  @Override
  public String getCertificateType() {
    return "High School Certificate";
  }

  private static Integer fromTenToHundredMark(Integer mark) {
    return mark * 10;
  }
}
