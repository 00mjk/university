package com.solvd.university;

import java.util.Objects;

public class FullTimeSpecializationPlan extends SpecializationPlan {

    private Integer freePlacesAmount;
    private Integer minMark;

    public FullTimeSpecializationPlan(
            Specialization specialization, Integer freePlacesAmount, Integer minMark
    ) {
        super(specialization);
        this.freePlacesAmount = freePlacesAmount;
        this.minMark = minMark;
    }

    public FullTimeSpecializationPlan(
            Specialization specialization, Integer paidPlacesAmount, Double cost
    ) {
        super(specialization, paidPlacesAmount, cost);
    }

    public FullTimeSpecializationPlan(
            Specialization specialization,
            Integer paidPlacesAmount,
            Double cost,
            Integer freePlacesAmount,
            Integer minMark
    ) {
        super(specialization, paidPlacesAmount, cost);
        this.freePlacesAmount = freePlacesAmount;
        this.minMark = minMark;
    }

    @Override
    public boolean isFreePlacesAccessible() {
        return freePlacesAmount > 0;
    }

    @Override
    public boolean isPaidPlacesAccessible() {
        return super.getPaidPlacesAmount() > 0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FullTimeSpecializationPlan that;
        that = (FullTimeSpecializationPlan) o;
        return Objects.equals(freePlacesAmount, that.freePlacesAmount)
                && Objects.equals(minMark, that.minMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freePlacesAmount, minMark);
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\ttype - full time\n\tfree places amount - %d\n\tminimal mark - %d",
                super.toString(), this.freePlacesAmount, this.minMark);
    }
}
