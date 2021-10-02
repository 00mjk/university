package com.solvd.askomar.university;

import java.util.Date;

public class SpecializationPlan {
    private Specialization specialization;
    private int freePlacesAmount;
    private int paidPlaceAmount;
    private int minMark;
    private Double paidCost;
    private Date date;

    public SpecializationPlan(Specialization specialization, Integer freePlacesAmount, Integer minMark) {
        this.specialization = specialization;
        this.freePlacesAmount = freePlacesAmount;
        this.minMark = minMark;
        this.date = new Date();
    }

    public SpecializationPlan(Specialization specialization, Integer freePlacesAmount, Integer paidPlaceAmount, Double paidCost) {
        this.specialization = specialization;
        this.freePlacesAmount = freePlacesAmount;
        this.paidPlaceAmount = paidPlaceAmount;
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

    public Integer getPaidPlaceAmount() {
        return paidPlaceAmount;
    }

    public void setPaidPlaceAmount(Integer paidPlaceAmount) {
        this.paidPlaceAmount = paidPlaceAmount;
    }

    public Double getPaidCost() {
        return paidCost;
    }

    public void setPaidCost(Double paidCost) {
        this.paidCost = paidCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMinMark() {
        return minMark;
    }

    public void setMinMark(Integer minMark) {
        this.minMark = minMark;
    }

    public String getInfo(boolean isPaid) {
        if(isPaid) {
            return this.specialization.getName() + "Paid places amount: " + this.paidPlaceAmount + " Cost: " + this.paidCost;
        } else {
                return this.specialization.getName() + " Free placesAmount: " + this.freePlacesAmount;
        }

    }

    public String getInfo(boolean isPaid, boolean withDateStamp) {
        return  this.getInfo(isPaid) + " DateStamp: " + new Date().toString();
    }
}
