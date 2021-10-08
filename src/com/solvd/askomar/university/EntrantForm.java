package com.solvd.askomar.university;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class EntrantForm implements Checkable {

    public static final int MAX_DOCUMENT_DAYS_DIFFERENCE = 10;

    public static Integer amount = 0;

    private Integer id;
    private Entrant entrant;
    private SpecializationPlan specializationPlan;
    private boolean paid;
    private Employee issuedBy;
    private LocalDate acceptedDate;

    public EntrantForm(
            Integer id, Entrant entrant, SpecializationPlan specializationPlan, boolean paid, Employee issuedBy, LocalDate acceptedDate
    ) {
        this.id = id;
        this.entrant = entrant;
        this.specializationPlan = specializationPlan;
        this.paid = paid;
        this.issuedBy = issuedBy;
        this.acceptedDate = acceptedDate;
        amount++;
    }

    @Override
    public boolean isValidDate() {
        Long differense = LocalDate.now().toEpochDay() - this.acceptedDate.toEpochDay();
        return ChronoUnit.DAYS.between(acceptedDate, LocalDate.now()) > MAX_DOCUMENT_DAYS_DIFFERENCE;
    }

    @Override
    public boolean isValidIdentificator() {
        return this.id > 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entrant getEntrant() {
        return entrant;
    }

    public void setEntrant(Entrant entrant) {
        this.entrant = entrant;
    }

    public SpecializationPlan getSpecializationPlan() {
        return specializationPlan;
    }

    public void setSpecializationPlan(SpecializationPlan specializationPlan) {
        this.specializationPlan = specializationPlan;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Employee getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Employee issuedBy) {
        this.issuedBy = issuedBy;
    }

    public LocalDate getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(LocalDate acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntrantForm that = (EntrantForm) o;
        return paid == that.paid
                && Objects.equals(entrant, that.entrant)
                && Objects.equals(specializationPlan, that.specializationPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrant, specializationPlan, paid);
    }

    @Override
    public String toString() {
        return String.format("Entrant form:\n\t%s\n\t%s\n\tpaid - %b", this.entrant, this.specializationPlan, this.paid);
    }
}
