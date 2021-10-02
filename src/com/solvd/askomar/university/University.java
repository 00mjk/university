package com.solvd.askomar.university;

import java.util.Date;

// transl. Университет
public class University {
    private String name;
    private City city;
    private Date foundationDate;
    private Departament[] departaments;

    public University(String name, City city, Date foundationDate) {
        this.name = name;
        this.city = city;
        this.foundationDate = foundationDate;
    }

    public University(String name, City city, Date foundationDate, Departament ... departaments) {
        this(name, city, foundationDate);
        this.departaments = departaments;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Departament[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departament[] departaments) {
        this.departaments = departaments;
    }

    public String getDepartamentsByString() {
        String resultString = "";
        for(int i = 0; i < departaments.length; i++) {
            resultString +=  departaments[i].getName() + " ";
        }
        return resultString;
    }

    public String getFullUnivercityInfo() {
        String info = "University: " + this.name + "\n";
        for(int i = 0; i < this.departaments.length; i++) {
            info += "Departament: " + this.departaments[i].getName() + "\n";
            for(int j = 0; j < this.departaments[i].getSpecializations().length; j++) {
                info += this.departaments[i].getSpecializations()[j].getName() + "\n";
            }
        }
        return info;
    }
}
