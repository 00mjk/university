package com.solvd.askomar.university;

import java.util.Objects;

public abstract class EntrantForm {

  public static Integer amount = 0;

  private Entrant entrant;
  private SpecializationPlan specializationPlan;
  private boolean paid;
  private Employee issuedBy;

  public EntrantForm(
      Entrant entrant, SpecializationPlan specializationPlan, boolean paid, Employee issuedBy) {
    this.entrant = entrant;
    this.specializationPlan = specializationPlan;
    this.paid = paid;
    this.issuedBy = issuedBy;
    amount++;
  }

  public EntrantForm(Entrant entrant, Specialization specialization, Boolean paid) {}

  public Entrant getEntrant() {
    return entrant;
  }

  public void setEntrant(Entrant entrant) {
    this.entrant = entrant;
  }

  public SpecializationPlan getSpecializationPlan() {
    return specializationPlan;
  }

  public void setSpecializationPlan(SpecializationPlan specializationPlan) {
    this.specializationPlan = specializationPlan;
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
        && Objects.equals(specializationPlan, that.specializationPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrant, specializationPlan, paid);
  }

  @Override
  public String toString() {
    return String.format(
        "Entrant form:\n\t%s\n\t%s\n\tpaid - %b", this.entrant, this.specializationPlan, this.paid);
  }
}
