package com.solvd.askomar.university;

import java.util.Objects;

// transl. Сотрудник
public class Employee {

  private String surname;
  private String name;
  private String patronymic;
  private EmployeePosition position;

  public Employee(String surname, String name, EmployeePosition position) {
    this.surname = surname;
    this.name = name;
    this.position = position;
  }

  public Employee(String surname, String name, String patronymic, EmployeePosition position) {
    this(surname, name, position);
    this.patronymic = patronymic;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public EmployeePosition getPosition() {
    return position;
  }

  public void setPosition(EmployeePosition position) {
    this.position = position;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Objects.equals(surname, employee.surname)
        && Objects.equals(name, employee.name)
        && Objects.equals(patronymic, employee.patronymic)
        && Objects.equals(position, employee.position);
  }

  // TODO refactror hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(surname, name, patronymic, position);
  }

  @Override
  public String toString() {
    return String.format("%s %s %s - %s", this.surname, this.name, this.patronymic, this.position);
  }
}
