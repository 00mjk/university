package com.solvd.askomar.university.specialplan;

import com.solvd.askomar.university.Specialization;

/** transl. План заочного приема */
public class DistanceSpecializationPlan extends SpecializationPlan {

  public DistanceSpecializationPlan(
      Specialization specialization, Integer paidPlacesAmount, Double cost) {
    super(specialization, paidPlacesAmount, cost);
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
    return String.format("%s\n\ttype - distance", super.toString());
  }
}
