package com.solvd.askomar.university.entrantform;

import com.solvd.askomar.university.Certificate;
import com.solvd.askomar.university.Entrant;
import com.solvd.askomar.university.Specialization;

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

  // TODO Refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BachelorEntrantForm that = (BachelorEntrantForm) o;
    return Arrays.equals(certificates, that.certificates)
        && this.getEntrant().equals(that.getEntrant())
        && this.getSpecialization().equals(that.getSpecialization())
        && this.paid() == that.paid();
  }

  // TODO Refactor hashcode algorithm
  @Override
  public int hashCode() {
    int hash = 1;
    for (Certificate c : certificates) {
      hash += 31 * c.hashCode();
    }
    return Arrays.hashCode(certificates);
  }

  @Override
  public String toString() {
    return String.format(
        "Bachelor entrant form: \n\tEducation specialisation -  %s,\n\tEntrant: %s\n\tCertificates: %s\n\tPaid?: %b",
        this.getSpecialization(),
        this.getEntrant(),
        Arrays.toString(this.certificates),
        this.paid());
  }

  public Integer getTotalMark() {
    Integer totalMark = 0;
    for (Certificate certificate : this.certificates) {
      totalMark += certificate.getMark();
    }
    return totalMark;
  }
}
