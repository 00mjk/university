package com.solvd.university;

public class DistanceSpecializationPlan extends SpecializationPlan {

    public DistanceSpecializationPlan(Specialization specialization, Integer paidPlacesAmount, Double cost) {
        super(specialization, paidPlacesAmount, cost);
    }

    @Override
    public boolean isFreePlacesAccessible() {
        return false;
    }

    @Override
    public boolean isPaidPlacesAccessible() {
        return super.getPaidPlacesAmount() > 0;
    }

    @Override
    public String toString() {
        return String.format("%s\n\ttype - distance", super.toString());
    }
}
