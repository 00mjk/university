package com.solvd.askomar.university;

import java.util.Date;

// transl. Университет
public class University {

  private String name;
  private City city;
  private Date foundationDate;
  private Department[] departments;

  public University(String name, City city, Date foundationDate) {
    this.name = name;
    this.city = city;
    this.foundationDate = foundationDate;
  }

  public University(String name, City city, Date foundationDate, Department[] departments) {
    this(name, city, foundationDate);
    this.departments = departments;
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

  public Department[] getDepartaments() {
    return departments;
  }

  public void setDepartaments(Department[] departments) {
    this.departments = departments;
  }

  public String getDepartamentsByString() {
    String resultString = "";
    for (int i = 0; i < departments.length; i++) {
      resultString += departments[i].getName() + " ";
    }
    return resultString;
  }

  public String getFullUnivercityInfo() {
    String info = "University: " + this.name + "\n";
    for (int i = 0; i < this.departments.length; i++) {
      info += "Department: " + this.departments[i].getName() + "\n";
      for (int j = 0; j < this.departments[i].getSpecializations().length; j++) {
        info += this.departments[i].getSpecializations()[j].getName() + "\n";
      }
    }
    return info;
  }
}
