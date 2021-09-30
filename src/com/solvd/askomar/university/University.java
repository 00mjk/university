package com.solvd.askomar.university;

// transl. Университет
public class University {
    private String name;
    private Departament[] departaments;
    private Integer rating;

    public University(String name) {
        this.name = name;
    }

    public University(String name, Departament[] departaments) {
        this(name);
        this.departaments = departaments;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Departament[] getDepartaments() {
        return this.departaments;
    }

    public void setDepartaments(Departament[] departaments) {
        this.departaments = departaments;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
