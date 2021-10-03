package com.solvd.askomar.university;

import java.util.Date;

public class SpecializationPlan {

    private Specialization specialization;
    private int freePlacesAmount;
    private int paidPlacesAmount;
    private int minMark;
    private Double paidCost;
    private Date lastUpdate;

    public SpecializationPlan(Specialization specialization, Integer freePlacesAmount, Integer minMark) {
        this.specialization = specialization;
        this.freePlacesAmount = freePlacesAmount;
        this.minMark = minMark;
        this.lastUpdate = new Date();
    }

    public SpecializationPlan(Specialization specialization, Integer freePlacesAmount, Integer paidPlaceAmount, Double paidCost) {
        this.specialization = specialization;
        this.freePlacesAmount = freePlacesAmount;
        this.paidPlacesAmount = paidPlaceAmount;
        this.paidCost = paidCost;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Integer getFreePlacesAmount() {
        return freePlacesAmount;
    }

    public void setFreePlacesAmount(Integer freePlacesAmount) {
        this.freePlacesAmount = freePlacesAmount;
    }

    public Integer getPaidPlacesAmount() {
        return paidPlacesAmount;
    }

    public void setPaidPlacesAmount(Integer paidPlacesAmount) {
        this.paidPlacesAmount = paidPlacesAmount;
    }

    public Double getPaidCost() {
        return paidCost;
    }

    public void setPaidCost(Double paidCost) {
        this.paidCost = paidCost;
    }

    public Integer getMinMark() {
        return minMark;
    }

    public void setMinMark(Integer minMark) {
        this.minMark = minMark;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getInfo(boolean paid) {
        if(paid) {
            return String.format("%s: paid places amount - %d, cost - %f", this.specialization.getName(), this.paidPlacesAmount, this.paidCost);
        } else {
            return String.format("%s: free places amount - %d", this.specialization.getName(), this.freePlacesAmount);
        }
    }
}
