package com.solvd.university;

import java.util.Date;
import java.util.Objects;

public abstract class SpecializationPlan implements Accessible {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecializationPlan that = (SpecializationPlan) o;
        return Objects.equals(specialization, that.specialization)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialization, paidPlacesAmount, cost, lastUpdate);
    }

    @Override
    public String toString() {
        return String.format(
                "Specialisation plan:\n\tspecialisation - %s\n\tpaid places amount - %d\n\tcost - %f\n\tlast update - %s",
                this.specialization, this.paidPlacesAmount, this.cost, this.lastUpdate);
    }
}
