package com.solvd.askomar.university.entrantform;

import com.solvd.askomar.university.Entrant;
import com.solvd.askomar.university.Specialization;
import com.solvd.askomar.university.certificate.Certificate;

import java.util.Arrays;

/** transl. Заявка на получение высшего образования 1-й ступени (Бакалариат) */
public class BachelorEntrantForm extends EntrantForm {

  private Certificate[] certificates;

  public BachelorEntrantForm(
      Entrant entrant, Specialization specialization, Boolean paid, Certificate[] certificates) {
    super(entrant, specialization, paid);
    this.certificates = certificates;
  }

  public Certificate[] getCertificates() {
    return certificates;
  }

  public void setCertificates(Certificate[] certificates) {
    this.certificates = certificates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    BachelorEntrantForm that = (BachelorEntrantForm) o;
    return Arrays.equals(certificates, that.certificates);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + Arrays.hashCode(certificates);
    return result;
  }

  @Override
  public String toString() {
    return String.format(
        "%s\n\ttype - bachelor entrant form\n\tCertificates: %s",
        super.toString(), Arrays.toString(this.certificates));
  }

  public Integer getTotalMark() {
    Integer totalMark = 0;
    for (Certificate certificate : this.certificates) {
      totalMark += certificate.getMark();
    }
    return totalMark;
  }
}
