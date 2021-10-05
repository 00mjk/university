package com.solvd.askomar.university.entrantform;

import com.solvd.askomar.university.Entrant;
import com.solvd.askomar.university.Specialization;

import java.util.Objects;

public abstract class EntrantForm {

  public static Integer amount = 0;

  private Entrant entrant;
  private Specialization specialization;
  private boolean paid;

  public EntrantForm(Entrant entrant, Specialization specialization, boolean paid) {
    this.entrant = entrant;
    this.specialization = specialization;
    this.paid = paid;
    amount++;
  }

  public Entrant getEntrant() {
    return entrant;
  }

  public void setEntrant(Entrant entrant) {
    this.entrant = entrant;
  }

  public Specialization getSpecialization() {
    return specialization;
  }

  public void setSpecialization(Specialization specialization) {
    this.specialization = specialization;
  }

  public boolean isPaid() {
    return paid;
  }

  public void setPaid(boolean paid) {
    this.paid = paid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EntrantForm that = (EntrantForm) o;
    return paid == that.paid
        && Objects.equals(entrant, that.entrant)
        && Objects.equals(specialization, that.specialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrant, specialization, paid);
  }

  @Override
  public String toString() {
    return String.format(
        "Entrant form:\n\t%s\n\t%s\n\tpaid - %b", this.entrant, this.specialization, this.paid);
  }
}
