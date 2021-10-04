package com.solvd.askomar.university;

import java.time.LocalDate;
import java.util.Objects;

/** transl. Абитуриент */
public class Entrant {

  private static Integer entrantAmount = 0;

  private Integer id;
  private String surname;
  private String name;
  private String patronymic;
  private LocalDate dateOfBirth;

  public Entrant(String surname, String name, LocalDate dateOfBirth) {
    this.id = ++entrantAmount;
    this.surname = surname;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

  public Entrant(String surname, String name, String patronymic, LocalDate dateOfBirth) {
    this(surname, name, dateOfBirth);
    this.patronymic = patronymic;
  }

  public static Integer getEntrantAmount() {
    return entrantAmount;
  }

  public Integer getId() {
    return this.id;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return this.patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  // TODO change equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Entrant entrant = (Entrant) o;
    return Objects.equals(id, entrant.id)
        && Objects.equals(surname, entrant.surname)
        && Objects.equals(name, entrant.name)
        && Objects.equals(patronymic, entrant.patronymic)
        && Objects.equals(dateOfBirth, entrant.dateOfBirth);
  }

  // TODO change hashcode algorihtm
  @Override
  public int hashCode() {
    return Objects.hash(id, surname, name, patronymic, dateOfBirth);
  }

  @Override
  public String toString() {
    return String.format(
        "%s %s %s %s", this.surname, this.name, this.patronymic, this.dateOfBirth.toString());
  }
}
