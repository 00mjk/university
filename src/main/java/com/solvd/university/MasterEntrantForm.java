package com.solvd.university;

import java.time.LocalDate;
import java.util.Objects;

public class MasterEntrantForm extends EntrantForm {

    private Specialization bachelorsSpec;
    private LocalDate finishedDate;

    public MasterEntrantForm(
            Integer id,
            Entrant entrant,
            SpecializationPlan specializationPlan,
            Boolean paid,
            Employee issuedBy,
            LocalDate acceptedDate,
            Specialization bachelorsSpec,
            LocalDate finishedDate
    ) {
        super(id, entrant, specializationPlan, paid, issuedBy, acceptedDate);
        this.bachelorsSpec = bachelorsSpec;
        this.finishedDate = finishedDate;
    }

    public Specialization getBachelorsSpec() {
        return bachelorsSpec;
    }

    public void setBachelorsSpec(Specialization bachelorsSpec) {
        this.bachelorsSpec = bachelorsSpec;
    }

    public LocalDate getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(LocalDate finishedDate) {
        this.finishedDate = finishedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MasterEntrantForm that = (MasterEntrantForm) o;
        return Objects.equals(bachelorsSpec, that.bachelorsSpec)
                && Objects.equals(finishedDate, that.finishedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bachelorsSpec, finishedDate);
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\ttype - master entrant form\n\tbachelor's specialisation - %s\n\tfinished by - %s",
                super.toString(), this.bachelorsSpec, this.finishedDate);
    }
}
