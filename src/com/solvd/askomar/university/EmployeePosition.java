package com.solvd.askomar.university;

import java.util.Objects;

public class EmployeePosition {

  private String name;

  public EmployeePosition(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // TODO refactor equals algorihm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeePosition that = (EmployeePosition) o;
    return Objects.equals(name, that.name);
  }

  // TODO refactor hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return String.format("Employee position: %s", this.name);
  }
}
