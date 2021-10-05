package com.solvd.askomar.university.entrantform;

import com.solvd.askomar.university.Entrant;
import com.solvd.askomar.university.Specialization;

public abstract class EntrantForm {

  public static Integer amount = 0;

  private Entrant entrant;
  private Specialization specialization;
  private Boolean paid;

  public EntrantForm(Entrant entrant, Specialization specialization, Boolean paid) {
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

  public Boolean paid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


}
