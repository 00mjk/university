package com.solvd.university;

import java.time.LocalDate;
import java.util.Set;

public class FinalEntrantPlan<T extends SpecializationPlan> {

    private Set<T> yearPlan;
    private LocalDate year;
    private Employee responsibleEntrant;

    public FinalEntrantPlan(Set<T> yearPlan, LocalDate year, Employee responsibleEntrant) {
        this.yearPlan = yearPlan;
        this.year = year;
        this.responsibleEntrant = responsibleEntrant;
    }

    public Set<T> getYearPlan() {
        return yearPlan;
    }

    public void setYearPlan(Set<T> yearPlan) {
        this.yearPlan = yearPlan;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Employee getResponsibleEntrant() {
        return responsibleEntrant;
    }

    public void setResponsibleEntrant(Employee responsibleEntrant) {
        this.responsibleEntrant = responsibleEntrant;
    }
}
