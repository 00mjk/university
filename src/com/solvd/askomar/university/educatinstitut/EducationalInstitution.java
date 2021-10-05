package com.solvd.askomar.university.educatinstitut;

import com.solvd.askomar.university.City;

import java.util.Date;

public abstract class EducationalInstitution {

  private String name;
  private Date basedDate;
  private City city;

  public EducationalInstitution(String name) {
    this.name = name;
  }

  public EducationalInstitution(String name, Date basedDate, City city) {
    this.name = name;
    this.basedDate = basedDate;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBasedDate() {
    return basedDate;
  }

  public void setBasedDate(Date basedDate) {
    this.basedDate = basedDate;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public abstract String getEducationalInstitutionType();
}
