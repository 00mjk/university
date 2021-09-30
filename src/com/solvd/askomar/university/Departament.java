package com.solvd.askomar.university;

// transl. Кафедра
public class Departament {
    private String name;
    private Specialization[] specializations;

    public Departament(String name) {
        this.name = name;
    }

    public Departament(String name, Specialization[] specializations) {
        this(name);
        this.setSpecializations(specializations);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization[] getSpecializations() {
        return this.specializations;
    }

    public void setSpecializations(Specialization[] specializations) {
        this.specializations = specializations;
    }
}
