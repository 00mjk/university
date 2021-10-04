package com.solvd.askomar.university;

import java.util.Objects;

public class Specialization {

  private String name;

  public Specialization(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Specialization that = (Specialization) o;
    return Objects.equals(name, that.name);
  }

  // TODO refactor hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return String.format("Specialisation: %s", this.name);
  }
}
