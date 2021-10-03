package com.solvd.askomar.university;

public class EntrantForm {

    public static Integer entrantFormsAmount = 0;

    private Entrant entrant;
    private Specialization specialization;
    private boolean paid;

    public EntrantForm(Entrant entrant, Specialization specialization, boolean paid) {
        this.entrant = entrant;
        this.specialization = specialization;
        this.paid = paid;
    }

    public Entrant getEntrant() {
        return entrant;
    }

    public void setEntrant(Entrant entrant) {
        this.entrant = entrant;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
