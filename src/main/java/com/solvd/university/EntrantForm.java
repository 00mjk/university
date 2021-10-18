package com.solvd.university;

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
        if (id < 0 || Objects.isNull(entrant) ||
                Objects.isNull(specializationPlan) ||
                Objects.isNull(issuedBy) ||
                Objects.isNull(acceptedDate) ||
                acceptedDate.compareTo(LocalDate.now()) > 0
        ) {
            throw new EntrantFormInvalidDataException("Entrant form should have valid data");
        }
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
        if (id < 0) {
            throw new EntrantFormInvalidDataException("Entrant form id should be more than 0");
        }
        this.id = id;
    }

    public Entrant getEntrant() {
        return entrant;
    }

    public void setEntrant(Entrant entrant) {
        if (Objects.isNull(entrant)) {
            throw new EntrantFormInvalidDataException("Entrant in 'Entrant form' should exists");
        }
        this.entrant = entrant;
    }

    public SpecializationPlan getSpecializationPlan() {
        return specializationPlan;
    }

    public void setSpecializationPlan(SpecializationPlan specializationPlan) {
        if (Objects.isNull(specializationPlan)) {
            throw new EntrantFormInvalidDataException("Specialisation plan in 'Entrant form' should exists");
        }
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
        if (Objects.isNull(issuedBy)) {
            throw new EntrantFormInvalidDataException("Employee in 'Entrant form' should exists");
        }
        this.issuedBy = issuedBy;
    }

    public LocalDate getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(LocalDate acceptedDate) {
        if (Objects.isNull(acceptedDate)) {
            throw new EntrantFormInvalidDataException("Date in 'Entrant form' should exists");
        }
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
