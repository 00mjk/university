package com.solvd.askomar.university.specialplan;

import com.solvd.askomar.university.Specialization;

import java.util.Date;

public abstract class SpecializationPlan {

  private Specialization specialization;
  private int paidPlacesAmount;
  private Double cost;
  private Date lastUpdate;

  public SpecializationPlan(Specialization specialization) {
    this.specialization = specialization;
    this.lastUpdate = new Date();
  }

  public SpecializationPlan(Specialization specialization, Integer paidPlacesAmount, Double cost) {
    this(specialization);
    this.paidPlacesAmount = paidPlacesAmount;
    this.cost = cost;
  }

  public Specialization getSpecialization() {
    return specialization;
  }

  public void setSpecialization(Specialization specialization) {
    this.specialization = specialization;
  }

  public Integer getPaidPlacesAmount() {
    return paidPlacesAmount;
  }

  public void setPaidPlacesAmount(Integer paidPlacesAmount) {
    this.paidPlacesAmount = paidPlacesAmount;
  }

  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
