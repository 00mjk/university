package com.solvd.askomar.university.specialplan;

import com.solvd.askomar.university.Specialization;

import java.util.Objects;

public class FullTimeSpecializationPlan extends SpecializationPlan {

  private Integer freePlacesAmount;
  private Integer minMark;

  public FullTimeSpecializationPlan(
      Specialization specialization, Integer freePlacesAmount, Integer minMark) {
    super(specialization);
    this.freePlacesAmount = freePlacesAmount;
    this.minMark = minMark;
  }

  public Integer getFreePlacesAmount() {
    return freePlacesAmount;
  }

  public void setFreePlacesAmount(Integer freePlacesAmount) {
    this.freePlacesAmount = freePlacesAmount;
  }

  public Integer getMinMark() {
    return minMark;
  }

  public void setMinMark(Integer minMark) {
    this.minMark = minMark;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FullTimeSpecializationPlan that = (FullTimeSpecializationPlan) o;
    return Objects.equals(freePlacesAmount, that.freePlacesAmount)
        && Objects.equals(minMark, that.minMark);
  }

  // TODO refacttor hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(freePlacesAmount, minMark);
  }

  @Override
  public String toString() {
    return "FullTimeSpecializationPlan{"
        + "freePlacesAmount="
        + freePlacesAmount
        + ", minMark="
        + minMark
        + '}';
  }
}
