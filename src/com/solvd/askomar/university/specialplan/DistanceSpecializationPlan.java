package com.solvd.askomar.university.specialplan;

import com.solvd.askomar.university.Specialization;

/** transl. План заочного приема */
public class DistanceSpecializationPlan extends SpecializationPlan {

  public DistanceSpecializationPlan(
      Specialization specialization, Integer paidPlacesAmount, Double cost) {
    super(specialization, paidPlacesAmount, cost);
  }

  @Override
  public String toString() {
    return String.format(
        "Distance Specialization Plan:\n\tSpecialisation: %s\n\tPaid places amount: %d\n\tCost: %f",
        this.getSpecialization(), this.getPaidPlacesAmount(), this.getCost());
  }
}
