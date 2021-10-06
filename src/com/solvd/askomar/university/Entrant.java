package com.solvd.askomar.university;

import java.time.LocalDate;
import java.util.Objects;

public class Entrant extends Person {

    private static Integer entrantAmount = 0;

    private Integer id;
    private LocalDate dateOfBirth;

    public Entrant(String surname, String name, LocalDate dateOfBirth) {
        super(surname, name);
        this.id = ++entrantAmount;
        this.dateOfBirth = dateOfBirth;
    }

    public Entrant(String surname, String name, String patronymic, LocalDate dateOfBirth) {
        super(surname, name, patronymic);
        this.dateOfBirth = dateOfBirth;
    }

    public static Integer getEntrantAmount() {
        return entrantAmount;
    }

    public Integer getId() {
        return this.id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrant entrant = (Entrant) o;
        return Objects.equals(id, entrant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, dateOfBirth);
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s %s %s",
                this.getSurname(), this.getName(), this.getPatronymic(), this.dateOfBirth.toString());
    }

    @Override
    public String shortNameFormat() {
        return String.format("%s. - %s", super.shortNameFormat(), "entrant");
    }
}
