package com.solvd.askomar.university;

// transl. Кафедра
public class Department {

    private String name;
    private Specialization[] specializations;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Specialization... specializations) {
        this(name);
        this.specializations = specializations;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization[] getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Specialization... specializations) {
        this.specializations = specializations;
    }
}
